package com.financial.financialsystem.services.impl;



import com.financial.financialsystem.services.QiniuService;
import com.financial.financialsystem.util.QiniuUtils;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

@Service
public class QiniuServiceImpl implements QiniuService, InitializingBean {
    @Autowired
    private UploadManager uploadManager;
    @Autowired
    private Auth auth;
    @Autowired
    private QiniuUtils qiNiuProperties;
    private StringMap putPolicy;
    String key = null;

    @Override
    public Response uploadFile(File file) throws QiniuException {
        Response response = this.uploadManager.put (file, key, getUploadToken ( ));
        int retry = 0;
        while (response.needRetry ( ) && retry < 3) {
            response = this.uploadManager.put (file, key, getUploadToken ( ));
            retry++;
        }
        return response;
    }

    @Override
    public Response uploadFile(InputStream inputStream) throws QiniuException {
        Response response = this.uploadManager.put (inputStream, null, getUploadToken ( ), null, null);
        int trytimes = 0;
        while (response.needRetry ( ) && trytimes < 3) {
            response = this.uploadManager.put (inputStream, null, getUploadToken ( ), null, null);
            trytimes++;
        }
        return response;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.putPolicy = new StringMap ( );
        putPolicy.put ("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"width\":$(imageInfo.width), \"height\":${imageInfo.height}}");
    }

    /**
     * 获取上传凭证
     *
     * @return
     */
    private String getUploadToken() {
        return this.auth.uploadToken (qiNiuProperties.getBucket ( ), null, 3600, putPolicy);
    }

}
