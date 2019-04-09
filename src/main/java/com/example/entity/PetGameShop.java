package com.bying.car.model.petGame;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pet_game_shop")
public class PetGameShop  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_date")
	private java.util.Date createDate;

	@Column(name = "modify_date")
	private java.util.Date modifyDate;

	@Column(name = "enable_status")
	private Integer enableStatus;

	@Column(name = "goods_type")
	private String goodsType;

	@Column(name = "goods_icon")
	private String goodsIcon;

	@Column(name = "goods_name")
	private String goodsName;

	@Column(name = "goods_code")
	private String goodsCode;

	@Column(name = "goods_desc")
	private String goodsDesc;

	@Column(name = "goods_price")
	private Double goodsPrice;

	private Integer inventory;

	private String energy;

	@Column(name = "feed_time")
	private String feedTime;

	@Column(name = "channel_id")
	private String channelId;

	@Column(name = "disabled_flag")
	private Integer disabledFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.util.Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(java.util.Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsIcon() {
		return goodsIcon;
	}

	public void setGoodsIcon(String goodsIcon) {
		this.goodsIcon = goodsIcon;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	public String getFeedTime() {
		return feedTime;
	}

	public void setFeedTime(String feedTime) {
		this.feedTime = feedTime;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getDisabledFlag() {
		return disabledFlag;
	}

	public void setDisabledFlag(Integer disabledFlag) {
		this.disabledFlag = disabledFlag;
	}

}
