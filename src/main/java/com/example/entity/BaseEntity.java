package com.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author yanzt
 * @date 2018/7/17 11:49
 * @description
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
}
