package com.example.json;

/**
 * @author yanzt
 * @date 2019/4/11 14:30
 * @describe 升级奖励、宝箱奖励定义model
 */
public class GameRewardVo {

    /**
     * 奖励类型
     * (1:食品,2:饰品,3:角色)',
     * */
    private String goodsType;
    //奖励名称
    private String goodsName;
    //奖励描述
    private String goodsDesc;
    //icon
    private String goodsIcon;
    //奖励为食物才存在-能量值
    private String energy;
    //奖励为食物才存在-进食时长（h）
    private Integer feedTime;
    //奖励数量
    private Integer goodsNumber;

    public GameRewardVo() {
    }

    public GameRewardVo(String goodsType, String goodsName, String goodsDesc, String goodsIcon, String energy, Integer feedTime, Integer goodsNumber) {
        this.goodsType = goodsType;
        this.goodsName = goodsName;
        this.goodsDesc = goodsDesc;
        this.goodsIcon = goodsIcon;
        this.energy = energy;
        this.feedTime = feedTime;
        this.goodsNumber = goodsNumber;
    }

    @Override
    public String toString() {
        return "GameRewardVo{" +
                "goodsType='" + goodsType + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsIcon='" + goodsIcon + '\'' +
                ", energy='" + energy + '\'' +
                ", feedTime=" + feedTime +
                ", goodsNumber=" + goodsNumber +
                '}';
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsIcon() {
        return goodsIcon;
    }

    public void setGoodsIcon(String goodsIcon) {
        this.goodsIcon = goodsIcon;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public Integer getFeedTime() {
        return feedTime;
    }

    public void setFeedTime(Integer feedTime) {
        this.feedTime = feedTime;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}