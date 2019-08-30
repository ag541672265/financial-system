package com.financial.financialsystem.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "alipay")
@Component
public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id ;//= "2016101000654581";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key;// = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCav7MxIPGuddx6fVs3+klk9n3MZUx/CXoUgOJ27H4GETCAMnCTNDYNg0vrk6XkzPDbx4UY4mWJjFULrVobCv/AO+FkZRvRUTSTlEXF40GZ3emhlkGHj+6C7M1hfBEHqcMyKoTnlXyqo1SZPdxWDNFqZ3914L+V9LY8643UuiMdCO9lpgNx7wRzzrx58qHmIJ2Xn+q6EphX6URfhp3k8sqtGzcTETiGT25EAV3Tb/2wFcGPHQxhllaCzNW/aclmo5L1nDfMffRJZs0rYk/i5KPibPrKAHT4fCC3d2mqg1q39s3v1B6/FsZtQenTEOxVFUPaLwXqrNBoqlYbDxoPC0anAgMBAAECggEADBDicfQ1o/rApDReBnFXg63MhUFow4cDo9Gg1tD9yo9Qjs5gBLpPdKJGKyoqBzsLlLdr41LTw/PTNcPggLdM1bpVirRvhNSmGtO21QUxOkQZUWYb2ewZFtBL+0vnMAfGloTGNCBtxghSMlimc3cwZPGI+LH7fj/Ebd+YAXw5/Kt0mWwUOrg9svJ/7TjTPVFtc/mL6VqzTbbWZUcsa0QfgfFbn7KCfJtXRCHyMw+hjnckdjkG2GR3x0d8ol7Xpc168cgcpVhrEK/7hcCCOssqQt0V8spn77sRiJPOHXpl/3g9tURmwMryPLOFjGV1CEx0Ez2N5tNs1tftiYOyxKa1cQKBgQDSLSJICnTpU94f4dDOntGdRn5TKUFVpMV4GVoXeTVXC7b1ZanT8otbCL39PGIwxZmuwg9AAh8YlevpfFygDBXecx+5fSaJEV11/S4FYG//oQDL7W0GhwspY3LUYl6+L66KgElPXNhekGim9t42UmZ+ovdKMgA48cDjjz6+O3wwJQKBgQC8fOoMn3Z6WfF4PLdLTknz7C8fyWW3tSL9qjDZQrucAYlAHx6KmHvXI/UB9HHdcYNxBEmPyJsA0Y/ecSrrMzhmsdNxHH0sCkt1jZbIyobTC6Z0ze34znkExaxGqgIrnlA4VrAunCwEr8XPify77yuYcYzXqCz1iOigdrX+OeKL2wKBgFkFANYeh7Ij8ZrzXCuHnSTOLMcwXBnYNkNOCZiToAIEVjPOIYZB3sBqDX5qyvP5XcRlMWxc+arCJS+5msm3FLQpcrBvz5iSoFFPMOTaGdXd7aZyI5F2NUYMdyB5ocNQEs9a0rIokwRKiejd+vRrJjpQ8Aie8PUtgBNiIqMUMt95AoGAeeMdRwRnjT9UkzhQH3aFBCObZabLDD0qX3cLF7O7tmqX4ss86MsqajlqWtVEPLsHELKBD2XeNm1N576uzmHU+zPLU73kg/I0UdQ5yaaOATPrdGUmmlqKj7d0bE3MEYDSx1vnmnyLSoyQEmFc+frz6iSju2GZkT3zkLCzh67O/TkCgYEAr3OCEj06isHhULkH9mU3a7UfC1dATqdoUk+KCslcMShlCwie4isaOMKxWtWq07X9LFYW47D8xtbbhzCjQSKR7NjGQQWvostvay4UXlE9bQ7g7cttKcwpwVscNeQ0R9k14LKPbi6vZWl9CAI/M8d3ykSjLjje8ShissikRptElVQ=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ;//= "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmr+zMSDxrnXcen1bN/pJZPZ9zGVMfwl6FIDidux+BhEwgDJwkzQ2DYNL65Ol5Mzw28eFGOJliYxVC61aGwr/wDvhZGUb0VE0k5RFxeNBmd3poZZBh4/uguzNYXwRB6nDMiqE55V8qqNUmT3cVgzRamd/deC/lfS2POuN1LojHQjvZaYDce8Ec868efKh5iCdl5/quhKYV+lEX4ad5PLKrRs3ExE4hk9uRAFd02/9sBXBjx0MYZZWgszVv2nJZqOS9Zw3zH30SWbNK2JP4uSj4mz6ygB0+Hwgt3dpqoNat/bN79QevxbGbUHp0xDsVRVD2i8F6qzQaKpWGw8aDwtGpwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url ;//= "http://www.baidu.com";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url;// = "http://localhost:8890/callBack";

    // 签名方式
    public static String sign_type;// = "RSA2";

    // 字符编码格式
    public static String charset ;//= "utf-8";

    // 支付宝网关
    public static String gatewayUrl ;//= "https://openapi.alipaydev.com/gateway.do";



    public  void setApp_id(String app_id) {
        AlipayConfig.app_id = app_id;
    }



    public  void setMerchant_private_key(String merchant_private_key) {
        AlipayConfig.merchant_private_key = merchant_private_key;
    }



    public  void setAlipay_public_key(String alipay_public_key) {
        AlipayConfig.alipay_public_key = alipay_public_key;
    }



    public  void setNotify_url(String notify_url) {
        AlipayConfig.notify_url = notify_url;
    }



    public  void setReturn_url(String return_url) {
        AlipayConfig.return_url = return_url;
    }



    public  void setSign_type(String sign_type) {
        AlipayConfig.sign_type = sign_type;
    }



    public  void setCharset(String charset) {
        AlipayConfig.charset = charset;
    }

    public  String getGatewayUrl() {
        return gatewayUrl;
    }

    public  void setGatewayUrl(String gatewayUrl) {
        AlipayConfig.gatewayUrl = gatewayUrl;
    }


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑



}
