package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripHotelFeature {
    /*酒店特征
    * */
    private Long id,hotelId,featureId,createdBy,modifiedBy;//主键id，酒店id（关联酒店），特征id，创建人，修改人
    private Date creationDate,modifyDate;//创建时间，修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
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
        return "ITripHotelFeature{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", featureId=" + featureId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
