package com.financial.financialsystem.util.qztest;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QzConfig {

    @Bean
    public Scheduler scheduler() throws SchedulerException {

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        JobDetail first = JobBuilder.newJob(FirstJob.class)
                .withIdentity("job1","group1").build();

        JobDetail second = JobBuilder.newJob(SecondJob.class)
                .withIdentity("job2","group2").build();

        JobDetail third = JobBuilder.newJob(ThirdJob.class)
                .withIdentity("job3","group3").build();

        TriggerBuilder<Trigger> newTrigger =  trigger();

        newTrigger.withIdentity("trigger1","gtoup1");
        newTrigger.withSchedule(CronScheduleBuilder
                .cronSchedule("10 30 * * * ? *"));
        Trigger one =  newTrigger.build();
        newTrigger.withIdentity("trigger2","group2");
        newTrigger.withSchedule(CronScheduleBuilder
                .cronSchedule("10 30 * * * ? *"));
        Trigger two =  newTrigger.build();
        newTrigger.withIdentity("trigger3","group3");
        newTrigger.withSchedule(CronScheduleBuilder
                .cronSchedule("0 30 1 * * ? *"));
        Trigger three =  newTrigger.build();

        scheduler.scheduleJob(first,one);
        scheduler.scheduleJob(second,two);
        scheduler.scheduleJob(third,three);
        scheduler.start();
        return  scheduler;

    }

    @Bean
    public TriggerBuilder<Trigger> trigger() {
        return TriggerBuilder.newTrigger();
    }

}
