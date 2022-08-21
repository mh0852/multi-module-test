package com.mh.web.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mh.project.entity.model.SecUser;
import com.mh.project.entity.model.User;
import com.mh.project.entity.model.UserDe;
import com.mh.service.ISecUserService;
import com.mh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        User user = userService.getBaseMapper().selectOne(queryWrapper);
        if(user == null) {
            throw new UsernameNotFoundException("not found");
        }
        System.out.println(user.getUsername() + ": " + user.getPassword());

        UserDe u1 = new UserDe();
        u1.setUsername(user.getUsername());
        u1.setPassword(user.getPassword());
        u1.setId(user.getId());
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_"+ secUser.getRole()));
        return u1;
    }
}
