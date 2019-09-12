<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>资产界面</title>
    <link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/user.css"/>
    <link rel="stylesheet" href="css/assets.css"/>
    <link href="css/iconfont/RjdaoIcon.css"  rel="stylesheet" type="text/css">
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
    <script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>

</head>
<body>
<!----最最上面的，像标头---->
<div class="topnav">
    <div class="mainw w">
        <div class="l-txt">欢迎致电：400-8800-379 &nbsp;&nbsp; 服务时间：08:30-18:30（工作日）</div>
        <#--<div class="wapbut">-->
        <#--<span>手机端</span><i class="icon-0198"></i>-->
        <#--<div class="qrc"><img src="images/qrc.png"></div>-->
        <#--</div>-->
        <a href="kefu.html" class="dh">在线客服</a>
        <a href="help.html" class="dh">帮助中心</a>
    </div>
</div>
<header>
    <div class="hmain w">
        <a href="/" class="logo"><img src="/images/logo.png"></a>
        <a href="/login" class="ubut">退出</a>
        <a href="/toassets" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>
        <nav>
            <a href="/">首页</a>
            <#--链接未完成部分'''-->
            <a href="/chaalljijin">基金</a>
            <a href="/licai">理财</a>
            <a href="/insurance">保险</a>
            <#--链接未完成部分...-->
        </nav>
    </div>
</header>
<!----header---->


<!---第一块，这里显示头像，账号什么的---->
<div class="user-top">

    <div class="userinfo">
        <script type="text/javascript">
            $(function() {
                $("#imgBtn").click(function() {
                    $("#pic").click();
                });
                $("#pic").change(function() {
                    var file = this.files[0];
                    var path = URL.createObjectURL(file);
                    $("#imgBtn").attr("src", path);
                });
            });
        </script>
        <a href="#" id="imgBtn" class="portrait" style="margin-top:10px;"><em>编辑头像</em>
         <input type="file" name="file" id="pic" value="null"><img src=${user.headimg} alt="头像"></a>
        <div class="minfo" style="margin-top:30px;">
            <div class="it">
                <dl>ID：</dl>
                <span class="mr1">${user.account}</span>
                <dl>用户名：</dl>
                <span>${user.nickName}</span></div>
            <div class="it">
                <dl>绑定手机号：</dl>
                <span>${user.phone}</span>
                <a class="ml1" title="手机"><i class="icon-0566"></i></a>
                <a class="ml1" title="QQ"><i class="icon-0069"></i></a>
                <a class="ml1" title="微信"><i class="icon-0061"></i></a>
                <a class="ml1" title="淘宝"><i class="icon-0064"></i></a>
                <a href="user_account.html" class="ml1" title="设置"><i class="icon-0421"></i></a>
                <a href="/detail" class="l"><i class="icon-0423"></i><span>账户设置</span></a>
            </div>
        </div>
        <div class="capital2">
            <a href="/chamezongjijin" class="ti">我的基金</a>
            <a href="" class="ti">我的理财</a>
            <a href="" class="ti">我的保险</a>
        </div>
    </div>

</div>
<!---user---->

<!--资产金额什么的在这儿-->
<div class="content-container">
    <div class="box-bill">
        <table class="box-bill-account fn-left">
            <tbody>
            <tr>
                <td colspan="2">
								<span class="box-bill-title bill-title-kyje">
									总资产(元)<a class="cc-zhxjoinlink fn-ml10" href="xxxxx全部的钱,包括基金,理财,剩余的余额"
                                             target="_blank" smartracker="on" seed="boxBillTitle-ccZhxjoinlink">
										<img width="16" height="17" src="images/qian.png">
									</a>
								</span>
                    <div class="box-bill-kyje-account fn-clear">
									<span class="box-bill-foot-account eye-val">
										${assets.money}
									</span>
                        <a title="转入" class="jui-btn jui-btn-blue box-bill-zhuanruLink fn-ml20" href="/toZhiFu"
                           target="_blank"
                           smartracker="on" seed="boxBillKyjeAccount-juiBtn">
                            转&nbsp;入
                        </a>
                        <a title="转出" class="fn-ml10 box-bill-zhuanchuLink  fn-ml10" href="xxxxx转出" target="_blank"
                           smartracker="on"
                           seed="boxBillKyjeAccount-boxBillZhuanchuLink">
                            转&nbsp;出
                        </a>

                         <a href="/chaalljijin">查看能购买的基金</a>

                    </div>

                    <div class="ui-line fn-clear"></div>
                </td>
            </tr>
            <tr>
                <td class="box-bill-foot">
								<span class="box-bill-title bill-title-zje">
									可用余额(元)<a class="cc-zhxjoinlink fn-ml10" href="xxxxx可以提现的钱" target="_blank"
                                              smartracker="on" seed="boxBillTitle-ccZhxjoinlink">
										<img width="16" height="17" src="images/qian.png">
									</a>
								</span>
                    <div class="box-bill-foot-account eye-val">
                        ${user.balance}
                    </div>
                </td>
                <td class="box-bill-foot td-line">
								<span class="box-bill-title  totalFreezeShare-title">
									体验金(元)<a class="cc-zhxjoinlink fn-ml10" href="xxxxx就是商家赠送的" target="_blank"
                                             smartracker="on" seed="boxBillTitle-ccZhxjoinlink">
										<img width="16" height="17" src="images/qian.png">
									</a>
								</span>
                    <div class="box-bill-foot-account eye-val">
                        ${user.capital}
                    </div>
                </td>
            </tr>
            </tbody>
        </table>


        <ul class="box-bill-info   fn-left">
            <li class="box-bill-item">
                <span class="box-bill-info-title">昨日收益(元)</span>
                <div class="box-bill-info-account eye-val">${assets.yyingli}</div>
            </li>

            <li class="box-bill-item">
                <span class="box-bill-info-title">累计收益(元)</span>
                <div class="box-bill-info-account  eye-val">${assets.yingliprofit}</div>
            </li>

            <li>
						<span class="box-bill-info-title">
							基金(元)
						</span>
                <div class="box-bill-info-account">
                    ${assets.jijin}
                </div>
            </li>

            <li>
						<span class="box-bill-info-title">
							理财(元)
						</span>
                <div class="box-bill-info-account">
                    ${assets.licai}
                </div>

            </li>
        </ul>
        <div class="fn-clear"></div>
    </div>
</div>
<!---user---->

<#--这里写的是查看流水，应该有分页-->

<table border="1" align="center" width="900">
    <tr align="center">
        <td>订单号</td><td>信息</td><td>金额</td><td>日期</td><td>操作</td></tr>
    <#list tradesList as tl>
        <tr align="center">
            <td>${tl.orderNumber}</td><td>${tl.comment}</td><td>${tl.amount?string('0.00')}</td>
            <td>${tl.dealTime?string('yyyy-MM-dd hh:mm:ss')}</td><td>详情</td>
        </tr>
    </#list>
</table>

<!---user---->
<#--最下边的，显示一些比如说公司信息，什么公安局备案号什么的-->
<div class="ui-footer fn-clear" coor="footer">
    <div class="ui-footer-ctn">
        <!-- 最底部的 -->
        <div class="ui-footer-link">

            <a href="xxxxxx招商广告" target="_blank" seed="foot-1">募股频道</a>


            <em class="ui-separator">|</em>
            <a title="联系我们" href="xxxxxx联系我们" target="_blank" seed="foot-2">联系我们</a>

            <em class="ui-separator">|</em>
            <a title="International Business" href="xxxxxx我们的网站" target="_blank" seed="foot-3">我们的网站</a>


        </div>
        <div class="ui-footer-copyright">
            <style>
                .copyright, .copyright a, .copyright a:hover {
                    color: #808080;
                }
            </style>
            <div class="copyright">
                <a href="xxxxxx京ICP备：00000000号" target="_blank" smartracker="on" seed="copyright-link">© 2018
                    北京汇创点投科技有限公司 京ICP备：00000000号</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
