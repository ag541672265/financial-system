package com.financial.financialsystem.entity;


import java.util.Date;

/**
 * `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '身份证表编号',
 *   `uid` int(11) DEFAULT NULL COMMENT '用户表编号',
 *   `cName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
 *   `cardID` int(11) DEFAULT NULL COMMENT '身份证号',
 *   `catedate` datetime DEFAULT NULL,
 */

public class IdCard {
    private int cid;
    private int uid;
    private Date createDate;
    private String cName,cardID;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
}
