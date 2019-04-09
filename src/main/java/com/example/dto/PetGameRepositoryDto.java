package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yanzt
 * @date 2019/4/9 23:10
 * @describe
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class PetGameRepositoryDto implements Serializable {

    private Date createDate;
    private String channelId;
    private Integer shopGoodNumber;
    private String goodsName;
    private String goodsCode;
    private String goodsDesc;

    public PetGameRepositoryDto(Date createDate, String channelId, Integer shopGoodNumber) {
        this.createDate = createDate;
        this.channelId = channelId;
        this.shopGoodNumber = shopGoodNumber;
    }

    public PetGameRepositoryDto(Date createDate, String channelId, Integer shopGoodNumber, String goodsName, String goodsCode, String goodsDesc) {
        this.createDate = createDate;
        this.channelId = channelId;
        this.shopGoodNumber = shopGoodNumber;
        this.goodsName = goodsName;
        this.goodsCode = goodsCode;
        this.goodsDesc = goodsDesc;
    }
}
