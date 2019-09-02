package com.financial.financialsystem.entity;

import java.util.Date;
/*
id,自增列
uid,用户id
fid,基金的id
money,这个基金，这个人，有多少钱
updatetime,修改时间
 */
public class Userfund {
    private Integer id,uid,fid;
    private double money;
    private Date updatetime;

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }




}
