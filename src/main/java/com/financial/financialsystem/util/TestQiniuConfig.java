package com.financial.financialsystem.util;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;

@Configuration
public class TestQiniuConfig {


        /**
         * 七牛云配置
         */
        @Autowired
        private QiniuUtils qiniuUtils;
        private final MultipartProperties multipartProperties;
        public TestQiniuConfig(MultipartProperties multipartProperties) {
            this.multipartProperties = multipartProperties;
        }



    /**
         * 上传配置
         */
        @Bean
        @ConditionalOnMissingBean
        public MultipartConfigElement multipartConfigElement() {
            return this.multipartProperties.createMultipartConfig();
        }
        /**
         * 注册解析器
         */
        @Bean(name = DispatcherServlet.MULTIPART_RESOLVER_BEAN_NAME)
        @ConditionalOnMissingBean(MultipartResolver.class)
        public StandardServletMultipartResolver multipartResolver() {
            StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver ();
            multipartResolver.setResolveLazily(this.multipartProperties.isResolveLazily());
            return multipartResolver;
        }
        /**
         * 华东   Zone.zone0()
         * 华北   Zone.zone1()
         * 华南   Zone.zone2()
         * 北美   Zone.zoneNa0()
         */
        @Bean
        public com.qiniu.storage.Configuration qiniuConfig() {
            //华东
            return new com.qiniu.storage.Configuration(Zone.zone1 ());
        }
        /**
         * 构建一个七牛上传工具实例
         */
        @Bean
        public UploadManager uploadManager() {
            return new UploadManager(qiniuConfig());
        }
        /**
         * 认证信息实例
         *
         * @return
         */
        @Bean
        public Auth auth() {
            return Auth.create(qiniuUtils.getAccessKey (),
                    qiniuUtils.getSecretKey());
        }
        /**
         * 构建七牛空间管理实例
         */
        @Bean
        public BucketManager bucketManager() {
            return new BucketManager(auth(), qiniuConfig());
        }
        /**
         * 配置gson为json解析工具
         *
         * @return
         */
        @Bean
        public Gson gson() {
            return new Gson();
        }
    }



