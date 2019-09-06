package com.financial.financialsystem.services.impl;

import com.financial.financialsystem.external.fund.MessagesService;
import com.financial.financialsystem.external.fund.Trades;
import com.financial.financialsystem.external.fund.Userfund;
import com.financial.financialsystem.external.fund.Users;
import com.financial.financialsystem.services.FundService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundServiceImpl implements FundService {

    // 接口地址
    String address = "http://localhost:9999/service/webservice?wsdl";
    // 代理工厂
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean ();

    @Override
    public double zongjijin(Integer uid,int t) {

        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            Users us = ms.queryFUdetails(uid);
            if(t==1){
                double mealljijin = us.getBalance();
                System.out.println("总基金数额"+mealljijin);
                return mealljijin;
            }else if(t==0){
                double meyingli = us.getBalance()-us.getCapital();
                System.out.println("总盈利"+meyingli);
                return meyingli;
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return 0;
    }

    @Override
    public double yesterdayUTP(Integer uid,Integer type) {
        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果

            List<Trades> trs =ms.getTUP(uid,type);
            double meidingdan=0;
            for(Trades ts : trs){
                meidingdan+=ts.getAmount();
            }

            return meidingdan;
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return 0;
    }

    @Override
    public double mequeryfunds(Integer uid, Integer gid) {
        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            Userfund userfund = ms.chamejijin(uid,gid);
            double qian = userfund.getMoney();
            return qian;
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return 0;
    }

    @Override
    public List<Trades> getUSTD(Integer uid) {
        try {
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress (address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass (MessagesService.class);
            // 创建一个代理接口实现
            MessagesService ms = (MessagesService) jaxWsProxyFactoryBean.create ();
            // 数据准备
            // 调用代理接口的方法调用并返回结果
            List<Trades> tradesList = ms.moneyRecord(uid);
            return tradesList;
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return null;
    }

}
