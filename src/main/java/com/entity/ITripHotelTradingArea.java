package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripHotelTradingArea {
    /*商圈*/
    private Long id,hotelId,areaId,createdBy,modifiedBy;//该表主键id，酒店id（关联酒店），商圈id，创建人，修改人
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

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
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
        return "ITripHotelTradingArea{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", areaId=" + areaId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
