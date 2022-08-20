package com.mh.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description SpringSecurity安全框架配置
 */
@Configuration
@EnableWebSecurity//开启Spring Security的功能
////prePostEnabled属性决定Spring Security在接口前注解是否可用@PreAuthorize,@PostAuthorize等注解,设置为true,会拦截加了这些注解的接口
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * 基于内存的方式，创建两个用户admin/123456，user/123456
         * */
        auth.inMemoryAuthentication()
                .withUser("admin")//用户名
                .password(passwordEncoder().encode("1234567"))//密码
                .roles("ADMIN");//角色
        auth.inMemoryAuthentication()
                .withUser("user")//用户名
                .password(passwordEncoder().encode("1234568"))//密码
                .roles("USER");//角色
    }
    /**
     * 指定加密方式
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        // 使用BCrypt加密密码
        return new BCryptPasswordEncoder();
    }

//    @Autowired
//    VerifyCodeFilter verifyCodeFilter;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.addFilterBefore(verifyCodeFilter, UsernamePasswordAuthenticationFilter.class);
        http
                .authorizeRequests()//开启登录配置
                .antMatchers("/hello").hasRole("admin")//表示访问 /hello 这个接口，需要具备 admin 这个角色
                .anyRequest().authenticated()//表示剩余的其他接口，登录之后就能访问
                .and()
                .formLogin()
                //定义登录页面，未登录时，访问一个需要登录之后才能访问的接口，会自动跳转到该页面
//                .loginPage("/login")
                //登录处理接口
                .loginProcessingUrl("/doLogin")
                //定义登录时，用户名的 key，默认为 username
                .usernameParameter("uname")
                //定义登录时，用户密码的 key，默认为 password
                .passwordParameter("passwd")
                //登录成功的处理器
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter out = resp.getWriter();
                        out.write("success");
                        out.flush();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException exception) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter out = resp.getWriter();
                        out.write("fail");
                        out.flush();
                    }
                })
                .permitAll()//和表单登录相关的接口统统都直接通过
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter out = resp.getWriter();
                        out.write("logout success");
                        out.flush();
                    }
                })
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }

//    @Resource
//    private AuthenticationSuccessHandler loginSuccessHandler; //认证成功结果处理器
//    @Resource
//    private AuthenticationFailureHandler loginFailureHandler; //认证失败结果处理器
//
//    //http请求拦截配置
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.headers().frameOptions().disable();//开启运行iframe嵌套页面
//
//        http//1、配置权限认证
//                .authorizeRequests()
//                //配置不拦截路由
//                .antMatchers("/500").permitAll()
//                .antMatchers("/403").permitAll()
//                .antMatchers("/404").permitAll()
//                .antMatchers("/login").permitAll()
//                .anyRequest() //任何其它请求
//                .authenticated() //都需要身份认证
//                .and()
//                //2、登录配置表单认证方式
//                .formLogin()
//                .loginPage("/login")//自定义登录页面的url
//                .usernameParameter("username")//设置登录账号参数，与表单参数一致
//                .passwordParameter("password")//设置登录密码参数，与表单参数一致
//                // 告诉Spring Security在发送指定路径时处理提交的凭证，默认情况下，将用户重定向回用户来自的页面。登录表单form中action的地址，也就是处理认证请求的路径，
//                // 只要保持表单中action和HttpSecurity里配置的loginProcessingUrl一致就可以了，也不用自己去处理，它不会将请求传递给Spring MVC和您的控制器，所以我们就不需要自己再去写一个/user/login的控制器接口了
//                .loginProcessingUrl("/user/login")//配置默认登录入口
//                .defaultSuccessUrl("/index")//登录成功后默认的跳转页面路径
//                .failureUrl("/login?error=true")
//                .successHandler(loginSuccessHandler)//使用自定义的成功结果处理器
//                .failureHandler(loginFailureHandler)//使用自定义失败的结果处理器
//                .and()
//                //3、注销
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessHandler(new LogoutSuccessHandler() {
//                    @Override
//                    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//
//                    }
//                })
//                .permitAll()
//                .and()
//                //4、session管理
//                .sessionManagement()
//                .invalidSessionUrl("/login") //失效后跳转到登陆页面
//                //单用户登录，如果有一个登录了，同一个用户在其他地方登录将前一个剔除下线
//                //.maximumSessions(1).expiredSessionStrategy(expiredSessionStrategy())
//                //单用户登录，如果有一个登录了，同一个用户在其他地方不能登录
//                //.maximumSessions(1).maxSessionsPreventsLogin(true) ;
//                .and()
//                //5、禁用跨站csrf攻击防御
//                .csrf()
//                .disable();
//    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //配置静态文件不需要认证
        web.ignoring().antMatchers("/static/**");
    }


}