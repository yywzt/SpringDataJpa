package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yanzt
 * @date 2019/4/19 22:51
 * @describe
 */
@Entity
@Table(name = "pet_game_chapter")
@Data
public class PetGameChapter implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(updatable = false)
    private Date createDate;

    private Date modifyDate;

    @Column(columnDefinition = "INT default 1")
    private Integer enableStatus;

    private Long chapterPreId;

    private String chapterName;

    private String chapterVersion;

    private String chapterDesc;

    private String gameVersion;

    private String gameWall;

    private String mileage;

    private String tips;

    private String channelId;

    @Column(columnDefinition = "INT default 1")
    private Integer disabledFlag;

    @Override
    public String toString() {
        return "PetGameChapter{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", enableStatus=" + enableStatus +
                ", chapterPreId=" + chapterPreId +
                ", chapterName='" + chapterName + '\'' +
                ", chapterVersion='" + chapterVersion + '\'' +
                ", chapterDesc='" + chapterDesc + '\'' +
                ", gameVersion='" + gameVersion + '\'' +
                ", gameWall='" + gameWall + '\'' +
                ", mileage='" + mileage + '\'' +
                ", tips='" + tips + '\'' +
                ", channelId='" + channelId + '\'' +
                ", disabledFlag=" + disabledFlag +
                '}';
    }
}