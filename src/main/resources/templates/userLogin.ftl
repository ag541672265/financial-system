<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>汇添金</title>
<meta name="keywords" content="汇添金" />
<meta name="description" content="汇添金" />
<link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>
<link rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="css/user.css"/>
<link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
    <script type="text/javascript">

        function check(){
            var phoneNum=$("[name='phone']").val();
            var password=$("[name='password']").val();
            var reg = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;
            if(phoneNum=="" || phoneNum==null){
                alert("手机号不能为空");
                $("[name='phone']").focus().select();
                return false;
            }else if(!reg.test(phoneNum)){
                alert("输入格式必须为手机号");
                $("[name='phone']").val().clear();
                $("[name='phone']").focus().select();
                return false;
            }else if(password=="" || password==null){
                alert("密码不能为空");
                return false;
            } else{
                return true;
            }
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
      <a href="/" class="logo"><img src="/images/logo.png"></a>
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
            <form action="/doLogin" method="post">
                <div class="title">爱亲，欢迎您</div>
                <div class="text">请输入正确的账号密码登录用户中心</div>
                <input type="text" name="phone" required placeholder="请输入手机号码" autocomplete="off" class="input">
                <input type="password" name="password" required placeholder="请输入您的密码" autocomplete="off" class="input">
                <input type="submit" class="button2" onclick="check()" value="登   录">
                <div class="text2"><a href="/toRegister">我还没有账号，点此注册</a></div>
                <form>
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
