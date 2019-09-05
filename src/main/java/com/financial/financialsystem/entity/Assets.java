package com.financial.financialsystem.entity;

import java.util.Date;
/*
uid 用户编号
money   总的钱数
balance  用户余额
capital  用户的奖励金剩余
jijin  用户的基金总数
licai 用户的理财金总数
yjijin  用户昨日基金总收益
ylicai  用户昨日理财总收益
jijinprofit  用户的基金总收益
licaiprofit  用户的理财总收益
 */
public class Assets {
    private Integer uid;
    private double  money;
    private double balance;
    private double capital;
    private double jijin;
    private double licai;
    private double yjijin;
    private double ylicai;
    private double yyingli;
    private double jijinprofit;
    private double licaiprofit;
    private double yingliprofit;

    public double getYyingli() {
        return yyingli;
    }

    public void setYyingli(double yyingli) {
        this.yyingli = yyingli;
    }

    public double getYingliprofit() {
        return yingliprofit;
    }

    public void setYingliprofit(double yingliprofit) {
        this.yingliprofit = yingliprofit;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getJijin() {
        return jijin;
    }

    public void setJijin(double jijin) {
        this.jijin = jijin;
    }

    public double getLicai() {
        return licai;
    }

    public void setLicai(double licai) {
        this.licai = licai;
    }

    public double getYjijin() {
        return yjijin;
    }

    public void setYjijin(double yjijin) {
        this.yjijin = yjijin;
    }

    public double getYlicai() {
        return ylicai;
    }

    public void setYlicai(double ylicai) {
        this.ylicai = ylicai;
    }

    public double getJijinprofit() {
        return jijinprofit;
    }

    public void setJijinprofit(double jijinprofit) {
        this.jijinprofit = jijinprofit;
    }

    public double getLicaiprofit() {
        return licaiprofit;
    }

    public void setLicaiprofit(double licaiprofit) {
        this.licaiprofit = licaiprofit;
    }

}
