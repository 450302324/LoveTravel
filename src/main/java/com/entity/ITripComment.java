package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripComment {
    /*评论*/
    private Long id,hotelId,productId,orderId,userId,tripMode,createdBy,modifiedBy;
    //该表主键id,酒店id（关联酒店）,商品id,订单id,用户id,出游类型,创建人，修改人

    private Integer productType,isHavingImg,positionScore,facilitiesScore,serviceScore,hygieneScore,score,isOk;
    //商品类型(0:旅游产品 1:酒店产品 2:机票产品)，是否包含图片(当用户上传评论时检测)0:无图片 1:有图片，位置评分，设施评分，服务评分，卫生评分，综合评分，是否满意（0：有待改善 1：值得推荐）

    private String content;//评论内容
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTripMode() {
        return tripMode;
    }

    public void setTripMode(Long tripMode) {
        this.tripMode = tripMode;
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

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getIsHavingImg() {
        return isHavingImg;
    }

    public void setIsHavingImg(Integer isHavingImg) {
        this.isHavingImg = isHavingImg;
    }

    public Integer getPositionScore() {
        return positionScore;
    }

    public void setPositionScore(Integer positionScore) {
        this.positionScore = positionScore;
    }

    public Integer getFacilitiesScore() {
        return facilitiesScore;
    }

    public void setFacilitiesScore(Integer facilitiesScore) {
        this.facilitiesScore = facilitiesScore;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getHygieneScore() {
        return hygieneScore;
    }

    public void setHygieneScore(Integer hygieneScore) {
        this.hygieneScore = hygieneScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getIsOk() {
        return isOk;
    }

    public void setIsOk(Integer isOk) {
        this.isOk = isOk;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "ITripComment{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", productId=" + productId +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", tripMode=" + tripMode +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", productType=" + productType +
                ", isHavingImg=" + isHavingImg +
                ", positionScore=" + positionScore +
                ", facilitiesScore=" + facilitiesScore +
                ", serviceScore=" + serviceScore +
                ", hygieneScore=" + hygieneScore +
                ", score=" + score +
                ", isOk=" + isOk +
                ", content='" + content + '\'' +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
