package com.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yanzt
 * @date 2018/7/17 11:46
 * @description
 */
@Data
@Entity
@Table(name = "user_inf")
public class UserInf extends BaseEntity implements Serializable {

    @Column(name = "uname")
    private String username;

    @Column(name = "passwd")
    private String password;

    @Column(name = "gentel")
    private String gentel;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;
}
