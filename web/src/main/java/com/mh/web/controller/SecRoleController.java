package com.mh.web.controller;

import com.mh.project.entity.model.SecRole;
import com.mh.service.ISecRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2022-08-18
 */
@RestController
@RequestMapping("/secRole")
public class SecRoleController {

    @Autowired
    private ISecRoleService iSecRoleService;

    @RequestMapping("/test")
    public List<SecRole> getAllSecRole(){
        System.out.println("+++");
        System.out.println(iSecRoleService.getBaseMapper().selectList(null));
        return iSecRoleService.list();
//        return "1111111111";
    }

}
