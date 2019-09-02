<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>汇添金</title>
    <meta name="keywords" content="汇添金"/>
    <meta name="description" content="汇添金"/>
    <link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/user.css"/>
    <link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/jquery-1.9.0.js"></script>
    <script>
        // 修改对号颜色
        function ty() {
            // alert($("#ty").css("color"))
            var col = $("#ty").css("color");
            // alert(col)
            // alert(col=="rgb(204, 204, 204)")
            if (col=="rgb(204, 204, 204)"){
                $("#ty").css("color", "rgb(0,153,0)")
                $("#rdl").show();
                $("#gdl").hide();
            }else {
                $("#ty").css("color", "rgb(204, 204, 204)")
                $("#rdl").hide();
                $("#gdl").show();
            }
            // alert($("#ty").css("color"))
//              0,153,0
//             204,204,204
        }
    </script>
    <script type="text/javascript">
        //防止页面后退
        history.pushState(null, null, document.URL);
        window.addEventListener('popstate', function () {
            history.pushState(null, null, document.URL);
        });

    </script>
</head>

<body style="background-color:#f0f0f0;">

<!----header s---->
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
        <a href="/" class="logo"><img src="images/logo.png"></a>
        <#--<a href="/index" class="ubut">退出</a>-->
        <#--<a href="user_index" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>-->
        <nav>
            <a href="/">首页</a>
            <#--链接未完成部分'''-->
            <a href="/jijin">基金</a>
            <a href="/licai">理财</a>
            <a href="/insurance">保险</a>
            <a href="/huijinhong">汇金红</a>
            <#--链接未完成部分...-->

        </nav>
    </div>
</header>
<!----header e---->


<div class="login-banner" style="background:url(images/login_banner_bj.png) no-repeat center top;">

    <div class="lomain w">
        <div class="wframe">
            <div class="title" style="margin-top:10px;">30秒快速注册</div>
            <input type="text" name="name" required placeholder="请输入用户名" autocomplete="off" class="input ph">
            <input type="text" name="tel" required placeholder="请输入正确的手机号码" autocomplete="off" class="input ph">
            <input type="password" name="pass" required placeholder="请输入正确的密码" autocomplete="off" class="input ph">
            <input type="password" name="pass2" required placeholder="再次确认密码" autocomplete="off" class="input ph">
            <div class="tongyi"><i class="icon-0332" onclick="ty()"
                                   id="ty"></i><a>我已阅读并同意<em>《使用协议》</em>及<em>《隐私条款》</em></a></div>
            <input type="submit" class="button" value="登   录" id="rdl">
            <input type="buttom" class="button" value="登   录" style="display: none;background-color: grey" id="gdl">
            <div class="text2"><a href="/login">使用账号密码登录</a></div>
        </div>
    </div>

</div>


<!---footer s--->
<footer style="margin-top:0px;">
    <div class="fmain w">
        <div class="fm-top">
            <div class="left">

                <div class="ilist">
                    <h1>联系我们</h1>
                    <div class="t">客服电话</div>
                    <div class="tel">400-8800-379</div>
                    <div class="t">邮箱：1059193212@qq.com</div>
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
            <span>&copy; 2018 &nbsp;北京汇添金科技有限公司 &nbsp;京ICP备：12054803号 </span>
            <dl>市场有风险 投资需谨慎</dl>
        </div>
    </div>
</footer>
<!---footer e--->


</body>
</html>
