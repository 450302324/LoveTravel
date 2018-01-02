package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripHotel {
    /*酒店*/
    private Long id,countryId,provinceId,cityId,createdBy,modifiedBy;//该表主键id,所在国家id,所在省份id,所在城市id,创建人，修改人
    private String hotelName,address,details,facilities,hotelPolicy,redundantCityName,redundantProvinceName,redundantCountryName;
    //酒店名称，酒店所在地址，酒店介绍（保存附文本），酒店设施，酒店政策，城市名称 冗余字段，省名称 冗余字段，国家名称 冗余字段

    private Integer hotelType,hotelLevel,isGroupPurchase,redundantHotelStore;//酒店类型(1:国内酒店 2:国际酒店),(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店),是否是团购酒店
    private Date creationDate,modifyDate;//创建时间，修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
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

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    public String getRedundantCityName() {
        return redundantCityName;
    }

    public void setRedundantCityName(String redundantCityName) {
        this.redundantCityName = redundantCityName;
    }

    public String getRedundantProvinceName() {
        return redundantProvinceName;
    }

    public void setRedundantProvinceName(String redundantProvinceName) {
        this.redundantProvinceName = redundantProvinceName;
    }

    public String getRedundantCountryName() {
        return redundantCountryName;
    }

    public void setRedundantCountryName(String redundantCountryName) {
        this.redundantCountryName = redundantCountryName;
    }

    public Integer getHotelType() {
        return hotelType;
    }

    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    public Integer getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(Integer hotelLevel) {
        this.hotelLevel = hotelLevel;
    }

    public Integer getIsGroupPurchase() {
        return isGroupPurchase;
    }

    public void setIsGroupPurchase(Integer isGroupPurchase) {
        this.isGroupPurchase = isGroupPurchase;
    }

    public Integer getRedundantHotelStore() {
        return redundantHotelStore;
    }

    public void setRedundantHotelStore(Integer redundantHotelStore) {
        this.redundantHotelStore = redundantHotelStore;
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
        return "ITripHotel{" +
                "id=" + id +
                ", countryId=" + countryId +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", details='" + details + '\'' +
                ", facilities='" + facilities + '\'' +
                ", hotelPolicy='" + hotelPolicy + '\'' +
                ", redundantCityName='" + redundantCityName + '\'' +
                ", redundantProvinceName='" + redundantProvinceName + '\'' +
                ", redundantCountryName='" + redundantCountryName + '\'' +
                ", hotelType=" + hotelType +
                ", hotelLevel=" + hotelLevel +
                ", isGroupPurchase=" + isGroupPurchase +
                ", redundantHotelStore=" + redundantHotelStore +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
