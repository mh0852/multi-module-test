package com.mh.project.entity.model;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Role")
public class Role {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    private Long id;
    private String name;
    private String nameZh;

}
