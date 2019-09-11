package com.financial.financialsystem.util.qztest;

import com.financial.financialsystem.services.UserService;
import com.financial.financialsystem.util.ApplicationContextUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SecondJob implements Job {

    //每日余额加利息的定时任务
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        UserService userService = (UserService) ApplicationContextUtil.getBean("UserService");
        if(userService.balanceAlgorithm()){
            System.out.println("每天余额计算保存成功");
        }else{
            System.out.println("每天余额计算保存失败");
        }

    }
}
