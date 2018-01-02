package com.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripProductStore {
    /*产品库存*/

    private Long id,productId,createdBy,modifiedBy;//该表主键id,商品id,创建人，修改人
    private Integer productType,store;//商品类型(0:旅游产品 1:酒店产品 2:机票产品)，商品库存
    private Date creationDate,modifyDate;//创建时间，修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
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
        return "ITripProductStore{" +
                "id=" + id +
                ", productId=" + productId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", productType=" + productType +
                ", store=" + store +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
