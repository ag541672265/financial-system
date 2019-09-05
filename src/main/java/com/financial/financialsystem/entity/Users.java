package com.financial.financialsystem.entity;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;
import java.util.StringJoiner;

/**
 * uid '用户编号',
 * account '手机号加随机字母',
 * password '密码',
 * phone '手机号',
 * nickName '昵称',
 * cardstate '实名认证状态，1认证，0未认证，2审核中，3未通过审核',
 * email  '邮箱地址',
 * balance  '余额',
 * createDate '注册时间',
 * headimg '头像',
 * states '账号状态1正常，0封禁',
 * capital 不可提现资金
 */

public class Users {

    //视图有几个简单熟悉视图
    public interface UserSimpleView {
    }

    ;

    //显示重要属性视图
    public interface UserDetailView extends UserSimpleView {
    }

    ;


    private Integer uid, cardstate, states;
    private String account, password, phone, headimg, nickName, email;
    private Date createDate;
    private double balance,capital;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCardstate() {
        return cardstate;
    }

    public void setCardstate(Integer cardstate) {
        this.cardstate = cardstate;
    }


    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    @JsonView(UserSimpleView.class)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonView(UserDetailView.class)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @JsonView(UserDetailView.class)
    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    @JsonView(UserSimpleView.class)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonView(UserDetailView.class)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @JsonView(UserSimpleView.class)
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return new StringJoiner (", ", Users.class.getSimpleName ( ) + "[", "]")
                .add ("uid=" + uid)
                .add ("cardstate=" + cardstate)
                .add ("states=" + states)
                .add ("account='" + account + "'")
                .add ("password='" + password + "'")
                .add ("phone='" + phone + "'")
                .add ("headimg='" + headimg + "'")
                .add ("nickName='" + nickName + "'")
                .add ("email='" + email + "'")
                .add ("createDate=" + createDate)
                .add ("balance=" + balance)
                .add ("capital=" + capital)
                .toString ( );
    }
}
