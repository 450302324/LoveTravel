package com.entity;

/**
 * Created by Administrator on 2018/1/2.
 */
public class ITripTradeEnds {
    /*结账*/
    private Long id;//订单ID
    private String orderNo;//订单编号(注意非支付宝交易编号tradeNo)
    private Short flag;//标识字段(默认0：未处理；1：处理中)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "ITripTradeEnds{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", flag=" + flag +
                '}';
    }
}
