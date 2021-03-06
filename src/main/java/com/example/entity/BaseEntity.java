package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author yanzt
 * @date 2018/7/17 11:49
 * @description
 */
@Data
@MappedSuperclass
public class BaseEntity<PK> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected PK id;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    protected String createdBy;

    /**
     * 创建日期
     */
    @Column(name = "creation_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    protected Timestamp creationDate;

    /**
     * 修改人
     */
    @Column(name = "updated_by")
    protected String updatedBy;

    /**
     * 修改日期
     */
    @Column(name = "updation_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    protected Timestamp updationDate;

    /**
     * 是否可用
     */
    @Column(name = "enabled_flag")
    protected Long enabledFlag = 1L;
}
