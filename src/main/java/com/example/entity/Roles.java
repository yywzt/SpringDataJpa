package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yanzt
 * @date 2018/7/17 12:57
 * @description
 */
//@Data
@Entity
@Table(name = "roles")
//@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
public class Roles extends BaseEntity implements Serializable {

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_code")
    private String roleCode;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleName='" + roleName + '\'' +
                ", roleCode='" + roleCode + '\'' +
                '}';
    }
}
