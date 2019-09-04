package com.financial.financialsystem.entity;


import java.util.Date;

/**
 * `ticket` bigint(20) NOT NULL AUTO_INCREMENT,
 *   `accFrom` int(11) NOT NULL COMMENT '账号',
 *   `goodsID` int(11) NOT NULL COMMENT '商品编号',
 *   `amount` double NOT NULL COMMENT '金额',
 *   `type` int(11) NOT NULL COMMENT '交易类型：1:入金；2:出金；3:交易；4:推荐；5,买入保险；6，保险返利；
 *                                  7:基金盈利；8:理财盈利；9:基金买入；10:基金卖出；11:理财买入；12:理财卖出;',
 *   `dealTime` datetime NOT NULL COMMENT '时间',
 *   `comment` varchar(255) DEFAULT NULL COMMENT '交易详情',
 *   `status` int(255) NOT NULL DEFAULT '1',
 *   orderNumber 交易单号
 */

public class Trades {
    private Integer ticket,accFrom,goodsID,type,status;
    private double amount;
    private String comment,orderNumber;
    private Date dealTime;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }



    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getAccFrom() {
        return accFrom;
    }

    public void setAccFrom(Integer accFrom) {
        this.accFrom = accFrom;
    }

    public Integer getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(Integer goodsID) {
        this.goodsID = goodsID;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}
