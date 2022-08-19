package com.mh.project.entity.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色权限关系表
 * </p>
 *
 * @author baomidou
 * @since 2022-08-18
 */
@TableName("sec_role_permission")
public class SecRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色主键
     */
    private Long roleId;

    /**
     * 权限主键
     */
    private Long permissionId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "SecRolePermission{" +
        "roleId = " + roleId +
        ", permissionId = " + permissionId +
        "}";
    }
}
