package com.financial.financialsystem.util.qztest;

import com.financial.financialsystem.services.FundService;
import com.financial.financialsystem.util.ApplicationContextUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ThirdJob implements Job {

    //每日查基金的利息流水，然后存到本地数据库里
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        FundService fundService = (FundService) ApplicationContextUtil.getBean("fundService");
        if(fundService.getUSTD()){
            System.out.println("每天利息转存本地保存成功");
        }else{
            System.out.println("每天利息转存本地保存失败");
        }

    }
}
