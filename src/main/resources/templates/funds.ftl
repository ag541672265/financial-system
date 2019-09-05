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
    <link rel="stylesheet" href="css/index2.css"/>
    <link rel="stylesheet" href="css/basically.css?v=2">
    <link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
</head>

<body style="background-color:#f0f0f0;">

<!----header s---->
<div class="topnav">
    <div class="mainw w">
        <div class="l-txt">欢迎致电：400-0000-000 &nbsp;&nbsp; 服务时间：08:30-18:30（工作日）</div>
        <#--<div class="wapbut">-->
        <#--<span>手机端</span><i class="icon-0198"></i>-->
        <#--<div class="qrc"><img src="images/qrc.png"></div>-->
        <#--</div>-->
        <a href="kefu.html" class="dh">在线客服</a>
        <a href="help.html" class="dh">帮助中心</a>
        <#--<a href="xinshou.html" class="dh">新手指引</a>-->
    </div>
</div>

<header>
    <div class="hmain w">
        <a href="/" class="logo"><img src="images/logo.png" <#--alt="汇添金logo图片"-->></a>
        <#if user ??>
            <a href="/login" class="ubut">退出</a>
            <a href="/toUser" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>
        <#else>
            <a href="/register" class="topbut">注册</a>
            <a href="/login" class="topbut-cur">登录</a>
        </#if>
        <nav>

            <a href="/">首页</a>
            <#--链接未完成部分'''-->
            <a href="/jijin" class="cur">基金</a>
            <a href="/licai" >理财</a>
            <a href="/insurance">保险</a>
            <a href="/huijinhong">汇金红</a>
            <#--链接未完成部分...-->
        </nav>
    </div>
</header>
<!----header e---->


<div class="invest-banner txtcenter">
    <img  src="images/invest-banner.jpg">
</div>


<div>

    <a href="/mairujijin?fid=1&money=1000&type=9">购买基金</a>

    <div id="portfolio"></div>

    <ul id="portfolio-item">
        <#list fundsList as flist>
            <li><img src="https://ykp-1259331859.cos.ap-beijing.myqcloud.com/img/1.jpg" alt="${flist.getFname()}" /></li>
        </#list>
        <!--拓展li标签即可-->
    </ul>

    <nav id="navigation">
        <a href="#1" class="nav selected" data-page="1">1</a>
        <a href="#2" class="nav" data-page="2">2</a>

        <!--可拓展-->
        <!--<a href="#3" class="nav" data-page="3">3</a>-->

    </nav>
</div>
<script> if(!Modernizr.csstransforms3d) document.getElementById('information').style.display = 'block'; </script>
<script src="js/basic.js"></script>

<!---invest-title e--->


<!---footer s--->
<footer>
    <div class="fmain w">
        <div class="fm-top">
            <div class="left">

                <div class="ilist">
                    <h1>联系我们</h1>
                    <div class="t">客服电话</div>
                    <div class="tel">400-0000-000</div>
                    <div class="t">邮箱：xiezhengy6@126.com</div>
                </div>

                <div class="ilist">
                    <h1>关于我们</h1>
                    <a href="">公司简介</a>
                    <a href="">大事记</a>
                    <a href="">加入我们</a>
                </div>

                <div class="ilist">
                    <h1>帮助中心</h1>
                    <a href="">客户指引</a>
                </div>

            </div>
            <div class="right">
                <#--<div class="ewm"><img src="images/qrc.png"><span>添加我们的微信</span></div>-->
                <#--<div class="ewm" style="margin-left:20px;"><img src="images/qrc.png"><span>关注公众号</span></div>-->
            </div>
        </div>
        <div class="fm-bot">
            <span>&copy; 2018 &nbsp;北京汇创点投科技有限公司 &nbsp;京ICP备：00000000号 </span>
            <dl>市场有风险 投资需谨慎</dl>
        </div>
    </div>
</footer>
<!---footer e--->


<!---申请窗口 S---->

<!---客服代码 S--->
<div class="suspension">
    <div class="suspension-box">
        <a href="#" class="a a-service "><i class="i"></i></a>
        <a href="javascript:;" class="a a-service-phone "><i class="i"></i></a>
        <a href="javascript:;" class="a a-qrcode"><i class="i"></i></a>
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
                        <p class="red number">400-0000-000</p>
                    </div>
                </div>
                <div class="d-service-intro clearfix">

                </div>
            </div>
        </div>
        <div class="d d-qrcode">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="qrcode-img"><img src="images/side_ewm.jpg" alt=""></div>
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
</body>
</html>
