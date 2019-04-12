package com.example.entity;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author yanzt
 * @date 2019/4/9 14:49
 * @describe
 */
public interface PetGameRepositoryVo2 {

    Date getCreateDate();

    String getChannelId();

    Integer getShopGoodNumber();

    String getGoodsCode();

    String getGoodsName();

    String getGoodsDesc();

    Long getShopGoodId();

    @Value("#{target.shopGoodNumber + ' ' + target.channelId}")
    String getFullName();

}
