package com.bdqn.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripHotelRoom {
    /*酒店房间*/
    private Long id,hotelId,roomBedTypeId,createdBy,modifiedBy;//该表主键id，酒店id（关联酒店），酒店床型，创建人，修改人
    private String roomTitle;//房间名称
    private BigDecimal roomPrice,satisfaction;//房间价格，满意度（冗余字段，在用户评论后更新）
    private Integer isHavingBreakfast,payType,isBook,isCancel,isTimelyResponse;//是否包含早餐，支付类型：1:在线付 2:到店付 3:不限，是否可预订(0:不可以 1:可以)，是否可取消(0:不可 1:可以)，是否及时响应(0:不及时 1:及时)
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

    public Long getRoomBedTypeId() {
        return roomBedTypeId;
    }

    public void setRoomBedTypeId(Long roomBedTypeId) {
        this.roomBedTypeId = roomBedTypeId;
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

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    public BigDecimal getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(BigDecimal satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Integer getIsHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setIsHavingBreakfast(Integer isHavingBreakfast) {
        this.isHavingBreakfast = isHavingBreakfast;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getIsBook() {
        return isBook;
    }

    public void setIsBook(Integer isBook) {
        this.isBook = isBook;
    }

    public Integer getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Integer isCancel) {
        this.isCancel = isCancel;
    }

    public Integer getIsTimelyResponse() {
        return isTimelyResponse;
    }

    public void setIsTimelyResponse(Integer isTimelyResponse) {
        this.isTimelyResponse = isTimelyResponse;
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
        return "ITripHotelRoom{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", roomBedTypeId=" + roomBedTypeId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", roomTitle='" + roomTitle + '\'' +
                ", roomPrice=" + roomPrice +
                ", satisfaction=" + satisfaction +
                ", isHavingBreakfast=" + isHavingBreakfast +
                ", payType=" + payType +
                ", isBook=" + isBook +
                ", isCancel=" + isCancel +
                ", isTimelyResponse=" + isTimelyResponse +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
