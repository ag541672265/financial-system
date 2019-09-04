<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="utf-8">
    <title>汇添金</title>
    <meta name="keywords" content="汇添金" />
    <meta name="description" content="汇添金" />
    <link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/index.css"/>
    <link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/jquery-1.9.0.js"></script>
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>    <script type="text/javascript">
           $(function(){
               if("${info}"!=null && "${info}"!=""){
                   alert("${info}");
               }
           })
            function buy(e){
                var gid=$(e).children("input:eq(0)").val();
                var gName=$(e).children("input:eq(1)").val();
                $("[name='gid']").val(gid);
                $("[name='gName']").val(gName);
            };
    </script>
</head>

<body>

<!----header s---->
<div class="topnav">
    <div class="mainw w">
        <div class="l-txt">欢迎致电：400-8800-379 &nbsp;&nbsp; 服务时间：08:30-18:30（工作日）</div>
        <#--<div class="wapbut">
             <span>手机端</span><i class="icon-0198"></i>
            <div class="qrc"><img src="images/qrc.png"></div>
        </div>-->
        <a href="kefu.html" class="dh">在线客服</a>
        <a href="help.html" class="dh">帮助中心</a>
        <#--<a href="xinshou.html" class="dh">新手指引</a>-->
    </div>
</div>

<header class="w">
    <#--logo图片-->
    <a href="/index" class="logo"><img src="images/logo.png" <#--alt="汇添金logo图片"-->></a>
    <#if user ??>
        <a href="/index" class="ubut">退出</a>
        <a href="user_index" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>
    <#else>
        <a href="/toRegister" class="topbut">注册</a>
        <a href="/toLogin" class="topbut-cur">登录</a>
    </#if>
    <nav>
        <a href="/index" class="cur">首页</a>
        <#--链接未完成部分'''-->
        <a href="/toFund">基金</a>
        <a href="touzi_list.html">理财</a>
        <a href="insurance">保险</a>
        <a href="news_list.html">汇金红</a>
        <#--链接未完成部分...-->
    </nav>
</header>
<!----header e---->
<#--<div style="text-align: center;color: red;font-size: 25px">
    <#if info??>
        ${info}
    </#if>
</div>-->

<!--focus start-->
<#--变动使用jquery修改-->
<div class="focus" id="focus">

    <div class="login_box w">
        <div class="login">
            <div class="title">汇金红</div>
            <div class="nllv">3.351%</div>
            <div class="txt">月盈利率</div>
            <a onclick="shoenlistDiv(this)" pronum="7" class="jiabut">立即购买</a>
            <div class="txt" style="margin-top:20px;color:#333;">汇添金为您推荐产品</div>
        </div>
    </div>

    <#--滚动图片-->
    <div id="focus_m" class="focus_m">
        <ul>
            <li class="li_1" style="background:url(images/invest-banner.jpg) center 0 no-repeat #288cc0;"><a href="#" hidefocus="true"></a></li>
            <li class="li_2" style="background:url(images/fund1.jpg) center 0 no-repeat #76b7d8;"><a href="#" hidefocus="true"></a></li>
            <li class="li_3" style="background:url(images/fund2.jpg) center 0 no-repeat #bb3838;"><a href="#" hidefocus="true"></a></li>
            <li class="li_3" style="background:url(images/3.jpg) center 0 no-repeat #bb3838;"><a href="#" hidefocus="true"></a></li>
        </ul>
    </div>
    <a href="javascript:;" class="focus_l" id="focus_l" hidefocus="true" title="上一张"><b></b><span></span></a>
    <a href="javascript:;" class="focus_r" id="focus_r" hidefocus="true" title="下一张"><b></b><span></span></a>
</div>
<!--focus end-->






<!---invest-title s--->
<div class="invest-title"><dl></dl><span class="tx">热门基金</span><dl></dl></div>
<div class="invest-list w">
    <#list fundsList as fund>
        <div class="item">
            <div class="mask"></div>
            <div class="nhl">月盈利率：<span>${fund.rate?c}%</span></div>
            <div class="pic"><img src="${fund.gImg}"></div>
            <a onclick="buy(this),shoenlistDiv(this)"   pronum="1" class="joinbut">
                <input type="hidden" class="gid" value="${fund.gid}">
                <input type="hidden" class="gName" value="${fund.gName}">
                立即购买
            </a>
            <div class="title">${fund.gName}
                <span style="color: red;font-size: 25px">
                    <#if fund.termDate==1>定投3个月</#if>
                    <#if fund.termDate==2>定投6个月</#if>
                    <#if fund.termDate==3>定投12个月</#if>
                    <#if fund.termDate==4>定投18个月</#if>
                </span>
            </div>
            <div class="con">
                <span class="l">筹资金额：</span><em>1788 </em> <span class="l"> 元</span>
                <dl>已完成</dl><span class="r">状态：</span>
            </div>
        </div>
    </#list>
</div>
<!---invest-title e--->

<!---footer s--->
<div style="background-color:#EAEAEA;width:100%; height:auto; overflow:hidden; padding:30px 0;">

    <div class="way-title">为什么选择汇添金？</div>

    <div class="way-main w">

        <div class="item">
            <i class="ico1"></i>
            <div class="tit">
                <span>项目好</span>
                <dl>佣金高</dl>
            </div>
        </div>

        <div class="item">
            <i class="ico2"></i>
            <div class="tit">
                <span>收益好</span>
                <dl>专业风控优选优</dl>
            </div>
        </div>

        <div class="item">
            <i class="ico3"></i>
            <div class="tit">
                <span>融资快</span>
                <dl>项目成立1个工作日结佣</dl>
            </div>
        </div>

        <div class="item">
            <i class="ico4"></i>
            <div class="tit">
                <span>服务好</span>
                <dl>专业服务经理1对1贴心服务</dl>
            </div>
        </div>

    </div>

</div>
<!---footer e--->


<!---申请窗口 S---->
<div class="fullscreenMask" id="fullscreenMask" style="display:none;">
</div>
<div class="applyMain" id="applyMain" style="display:none;">
    <form action="/buyFund" method="post">
        <div class="title"><span>请确认购买信息</span><i class="icon-0310" onclick="hideenlistDiv()"></i></div>
        <input id="pronum" type="hidden" name="pronum" value="">
        <div class="txt" style="margin-top:30px;">所购基金：</div>
        <input type="hidden" name="gid" value="">
        <input type="text" name="gName" value="" autocomplete="off" class="input">
        <div class="txt" style="margin-top:15px;">购买金额：</div>
        <input type="text" name="money" required placeholder="请输入金额" autocomplete="off" class="input">
        <div class="txt" style="margin-top:15px;">购买意向情况说明：</div>
        <textarea name="textarea"  placeholder="请输入购买意向情况说明" class="textarea"></textarea>
        <input type="submit" class="button" value="提   交">
    </form>
</div>
<script type="text/javascript">

    function shoenlistDiv(form){
        //点击报名按钮将值传入文本框中
        var kcid=$(form).attr("pronum");
        var oText=document.getElementById('pronum');
        oText.value=kcid;
        //alert(kcid);
        //获取要显示的div对象
        var  otherDiv=document.getElementById('applyMain');
        //显示
        otherDiv.style.display="block";
        var  otherDiv=document.getElementById('fullscreenMask');
        otherDiv.style.display="block";

    }
    function hideenlistDiv(){
        //获取要显示的div对象
        var  otherDiv=document.getElementById('applyMain');
        //显示
        otherDiv.style.display="none";
        var  otherDiv=document.getElementById('fullscreenMask');
        otherDiv.style.display="none";
    }
</script>
<!---申请窗口 E---->

<!---客服代码 S--->
<div class="suspension">
    <div class="suspension-box">
        <a href="#" class="a a-service "><i class="i"></i></a>
        <a href="javascript:;" class="a a-service-phone "><i class="i"></i></a>
        <#--<a href="javascript:;" class="a a-qrcode"><i class="i"></i></a>-->
        <a href="javascript:;" class="a a-top"><i class="i"></i></a>
        <div class="d d-service">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="d-service-item clearfix">
                    <a href="http://wpa.qq.com/msgrd?v=3&uin={$WEB.qq}&site=qq&menu=yes" class="clearfix"><span class="circle"><i class="i-qq"></i></span><h3>咨询在线客服</h3></a>
                </div>
            </div>
        </div>
        <div class="d d-service-phone">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="d-service-item clearfix">
                    <span class="circle"><i class="i-tel"></i></span>
                    <div class="text">
                        <p>服务热线</p>
                        <p class="red number">400-8800-379</p>
                    </div>
                </div>
                <div class="d-service-intro clearfix">

                </div>
            </div>
        </div>
        <div class="d d-qrcode">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="qrcode-img"><img src="images/side_ewm.jpg" alt="" width="110"></div>
                <p>微信服务号</p>
            </div>
        </div>

    </div>
</div>

<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){

        /* ----- 侧边悬浮 ---- */
        $(document).on("mouseenter", ".suspension .a", function(){
            var _this = $(this);
            var s = $(".suspension");
            var isService = _this.hasClass("a-service");
            var isServicePhone = _this.hasClass("a-service-phone");
            var isQrcode = _this.hasClass("a-qrcode");
            if(isService){ s.find(".d-service").show().siblings(".d").hide();}
            if(isServicePhone){ s.find(".d-service-phone").show().siblings(".d").hide();}
            if(isQrcode){ s.find(".d-qrcode").show().siblings(".d").hide();}
        });
        $(document).on("mouseleave", ".suspension, .suspension .a-top", function(){
            $(".suspension").find(".d").hide();
        });
        $(document).on("mouseenter", ".suspension .a-top", function(){
            $(".suspension").find(".d").hide();
        });
        $(document).on("click", ".suspension .a-top", function(){
            $("html,body").animate({scrollTop: 0});
        });
        $(window).scroll(function(){
            var st = $(document).scrollTop();
            var $top = $(".suspension .a-top");
            if(st > 400){
                $top.css({display: 'block'});
            }else{
                if ($top.is(":visible")) {
                    $top.hide();
                }
            }
        });

    });
</script>
<!---客服代码 E--->
<script type="text/javascript" src="js/script.js"></script>
</body>
</html>
