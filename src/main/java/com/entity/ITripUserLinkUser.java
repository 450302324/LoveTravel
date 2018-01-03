package com.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripUserLinkUser {
    /*常用旅客吧？？？*/
    private Long id,createdBy,modifiedBy,userId;//该表主键id,创建人，修改人,用户id
    private String linkUserName,linkIdCard,linkPhone;//
    private Integer linkIdCardType;//证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
    private Date creationDate,modifyDate;//创建时间，修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    public String getLinkIdCard() {
        return linkIdCard;
    }

    public void setLinkIdCard(String linkIdCard) {
        this.linkIdCard = linkIdCard;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }



    public Integer getLinkIdCardType() {
        return linkIdCardType;
    }

    public void setLinkIdCardType(Integer linkIdCardType) {
        this.linkIdCardType = linkIdCardType;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ITripUserLinkUser{" +
                "id=" + id +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", userId=" + userId +
                ", linkUserName='" + linkUserName + '\'' +
                ", linkIdCard='" + linkIdCard + '\'' +
                ", linkPhone='" + linkPhone + '\'' +
                ", linkIdCardType=" + linkIdCardType +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
