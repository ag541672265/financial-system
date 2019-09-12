package com.financial.financialsystem.util.qztest;

import com.financial.financialsystem.util.ApplicationContextUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
public class FirstJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //FundsService fundsService = (FundsService) ApplicationContextUtil.getBean("myService");
        //fundsService.uplilv();
        System.out.println("定时");
    }
}
