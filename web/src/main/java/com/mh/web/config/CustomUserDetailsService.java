package com.mh.web.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mh.project.entity.model.SecUser;
import com.mh.service.ISecUserService;
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
    private ISecUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<SecUser> queryWrapper = new QueryWrapper<SecUser>();
        queryWrapper.eq("username",username);
        SecUser secUser = userService.getBaseMapper().selectOne(queryWrapper);
        if(secUser == null) {
            throw new UsernameNotFoundException("not found");
        }

//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_"+ secUser.getRole()));
        return (UserDetails) secUser;
    }
}
