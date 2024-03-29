package com.financial.financialsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.financial.financialsystem.dao")
@EnableTransactionManagement //事务声明
public class FinancialSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run (FinancialSystemApplication.class, args);
    }

}
