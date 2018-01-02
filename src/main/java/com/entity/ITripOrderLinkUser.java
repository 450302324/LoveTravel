package com.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripOrderLinkUser {
    /*常用旅客订单？？？*/
    private Long id,itr_id,orderId,linkUserId,createdBy,modifiedBy;//该表主键id,,订单id,联系人id,创建人，修改人
    private String linkUserName;//
    private Date creationDate,modifyDate;//创建时间，修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItr_id() {
        return itr_id;
    }

    public void setItr_id(Long itr_id) {
        this.itr_id = itr_id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getLinkUserId() {
        return linkUserId;
    }

    public void setLinkUserId(Long linkUserId) {
        this.linkUserId = linkUserId;
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
        return "ITripOrderLinkUser{" +
                "id=" + id +
                ", itr_id=" + itr_id +
                ", orderId=" + orderId +
                ", linkUserId=" + linkUserId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", linkUserName='" + linkUserName + '\'' +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
