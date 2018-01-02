package com.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripHotelOrder {
    /*订单*/
    private Long id,userId,hotelId,roomId,createdBy,modifiedBy;
    //该表主键id,用户id,冗余字段 酒店id,房间id,创建人，修改人

    private Integer orderType,count,bookingDays,orderStatus,payType,isNeedInvoice,invoiceType,bookType;
    //订单类型(0:旅游产品 1:酒店产品 2：机票产品)，消耗数量，预订天数，订单状态（0：待支付 1:已取消 2:支付成功 3:已消费）
    //支付方式:1:支付宝 2:微信 3:到店付，是否需要发票（0：不需要 1：需要），发票类型（0：个人 1：公司）
    //0:WEB端 1:手机端 2:其他客户端

    private String orderNo,tradeNo,hotelName,noticePhone,noticeEmail,specialRequirement,invoiceHead,linkUserName;
    //订单号,交易编号,冗余字段 酒店名称,联系手机号,联系邮箱,特殊需求,发票抬头,入住人名称

    private Date checkInDate,checkOutDate,creationDate,modifyDate;
    //入住时间,退房时间,创建时间，修改时间

    private BigDecimal payAmount;//支付金额

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
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

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBookingDays() {
        return bookingDays;
    }

    public void setBookingDays(Integer bookingDays) {
        this.bookingDays = bookingDays;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getIsNeedInvoice() {
        return isNeedInvoice;
    }

    public void setIsNeedInvoice(Integer isNeedInvoice) {
        this.isNeedInvoice = isNeedInvoice;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getNoticePhone() {
        return noticePhone;
    }

    public void setNoticePhone(String noticePhone) {
        this.noticePhone = noticePhone;
    }

    public String getNoticeEmail() {
        return noticeEmail;
    }

    public void setNoticeEmail(String noticeEmail) {
        this.noticeEmail = noticeEmail;
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    public String getInvoiceHead() {
        return invoiceHead;
    }

    public void setInvoiceHead(String invoiceHead) {
        this.invoiceHead = invoiceHead;
    }

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Override
    public String toString() {
        return "ITripHotelOrder{" +
                "id=" + id +
                ", userId=" + userId +
                ", hotelId=" + hotelId +
                ", roomId=" + roomId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", orderType=" + orderType +
                ", count=" + count +
                ", bookingDays=" + bookingDays +
                ", orderStatus=" + orderStatus +
                ", payType=" + payType +
                ", isNeedInvoice=" + isNeedInvoice +
                ", invoiceType=" + invoiceType +
                ", bookType=" + bookType +
                ", orderNo='" + orderNo + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", noticePhone='" + noticePhone + '\'' +
                ", noticeEmail='" + noticeEmail + '\'' +
                ", specialRequirement='" + specialRequirement + '\'' +
                ", invoiceHead='" + invoiceHead + '\'' +
                ", linkUserName='" + linkUserName + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                ", payAmount=" + payAmount +
                '}';
    }
}
