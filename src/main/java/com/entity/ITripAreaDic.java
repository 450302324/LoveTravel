package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripAreaDic {
    /*地区字典*/
    private Long id,parent,createdBy,modifiedBy;//该表主键id,父级区域,创建人，修改人
    private String name,areaNo,pinyin;//区域名称，区域编号，，
    private Integer isActivated,isTradingArea,isHot,level,isChina;
    //0:未激活 1:已激活，是否是商圈(0:不是 1:是)，hot(0:不是 1：是)，区域级别(0:国家级 1:省级 2:市级 3:县/区)，1:国内 2：国外
    private Date creationDate,modifyDate;//创建时间，修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Integer getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Integer isActivated) {
        this.isActivated = isActivated;
    }

    public Integer getIsTradingArea() {
        return isTradingArea;
    }

    public void setIsTradingArea(Integer isTradingArea) {
        this.isTradingArea = isTradingArea;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsChina() {
        return isChina;
    }

    public void setIsChina(Integer isChina) {
        this.isChina = isChina;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "ITripAreaDic{" +
                "id=" + id +
                ", parent=" + parent +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", name='" + name + '\'' +
                ", areaNo='" + areaNo + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", isActivated=" + isActivated +
                ", isTradingArea=" + isTradingArea +
                ", isHot=" + isHot +
                ", level=" + level +
                ", isChina=" + isChina +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
