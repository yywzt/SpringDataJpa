package com.example.entity;


import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

/**
 * @author yanzt
 * @date 2019/4/9 14:49
 * @describe
 */
public interface PetGameRepositoryVo2 {

    @Value("#{target.createDate + ' '}")
    String getCreateDate();

    @Value("#{target.channelId + ' '}")
    String getChannelId();

    @Value("#{target.shopGoodNumber + ' '}")
    String getShopGoodNumber();

    @Value("#{target.shopGoodNumber + ' ' + target.channelId}")
    String getFullName();

}
