package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pet_game_repository")
public class PetGameRepository  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_date")
	private java.util.Date createDate;

	@Column(name = "modify_date")
	private java.util.Date modifyDate;

	@Column(name = "enable_status")
	private Integer enableStatus;

	@Column(name = "shop_good_id")
	private Long shopGoodId;

	@Column(name = "shop_good_number")
	private Integer shopGoodNumber;

	@Column(name = "channel_id")
	private String channelId;

	private Long uid;

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

	public Long getShopGoodId() {
		return shopGoodId;
	}

	public void setShopGoodId(Long shopGoodId) {
		this.shopGoodId = shopGoodId;
	}

	public Integer getShopGoodNumber() {
		return shopGoodNumber;
	}

	public void setShopGoodNumber(Integer shopGoodNumber) {
		this.shopGoodNumber = shopGoodNumber;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

}
