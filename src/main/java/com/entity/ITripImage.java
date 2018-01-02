package com.bdqn.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripImage {
    /*酒店图片
    * */
    private Long id,itr_id,itr_id2,targetId,createdBy,modifiedBy;//该表主键id，，，关联id（不知道关联哪），创建人，修改人
    private String type,imgUrl;//类型：0-酒店图片 1-房间图片 2-评论图片，图片地址（工程路径）
    private Integer position;//图片上传顺序位置
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

    public Long getItr_id2() {
        return itr_id2;
    }

    public void setItr_id2(Long itr_id2) {
        this.itr_id2 = itr_id2;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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
        return "ITripImage{" +
                "id=" + id +
                ", itr_id=" + itr_id +
                ", itr_id2=" + itr_id2 +
                ", targetId=" + targetId +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", type='" + type + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", position=" + position +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
