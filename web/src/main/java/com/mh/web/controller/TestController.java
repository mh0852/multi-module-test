package com.mh.web.controller;

import com.mh.dao.mapper.UserMapper;
import com.mh.project.entity.model.Role;
import com.mh.project.entity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String request() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/login")
    public String request1() {
        System.out.println("login");
        return "login hh";
    }
//
//    @PostMapping("/doLogin")
//    public String request2(@RequestParam("username") String username,@RequestParam("password") String password) {
//
//        System.out.println("dologin");
//        System.out.println(username + ":" + password);
//        return "doLogin";
//    }

    @PostMapping("/index")
    public String index() {
        System.out.println("index");
        return "index";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        System.out.println("admin/hello");
        return "admin";
    }

    @GetMapping("/user/hello")
    public String user() {
        System.out.println("user/hello");
        return "user";
    }

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/insert")
    public String insert(){
//        User u1 = new User();
//        u1.setUsername("javaboy");
//        u1.setPassword("123");
//        u1.setAccountNonExpired(true);
//        u1.setAccountNonLocked(true);
//        u1.setCredentialsNonExpired(true);
//        u1.setEnabled(true);
//        List<Role> rs1 = new ArrayList<>();
//        Role r1 = new Role();
//        r1.setName("ROLE_admin");
//        r1.setNameZh("管理员");
//        rs1.add(r1);
//        u1.setRoles(rs1);
//        userMapper.insert(u1);
        return "";
    }

}