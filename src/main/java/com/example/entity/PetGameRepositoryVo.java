package com.example.entity;


import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

/**
 * @author yanzt
 * @date 2019/4/9 14:49
 * @describe
 */
public interface PetGameRepositoryVo {

    @Value("#{target.shopGoodNumber + ' ' + target.channelId}")
    String getFullName();

    Date getCreateDate();

    Long getShopGoodId();

    Integer getShopGoodNumber();

    String getChannelId();

    Long getUid();

    String getGoodsType();

    String getGoodsIcon();

    String getGoodsName();

    String getGoodsCode();

    String getGoodsDesc();

    Double getGoodsPrice();

    String getEnergy();

    String getFeedTime();

}
