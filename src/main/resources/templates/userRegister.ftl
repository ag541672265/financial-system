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
        $(function(){
            if("${info}"!=null && "${info}"!=""){
                alert("${info}");
            }
        }
            /*$("[name='nickName']").blur(function(){
                var nickName=$("[name='nickName']").val();
                $.post("/checkNickName",{"nickName":nickName},
                    function(n){
                        var m=parseInt(n);
                        if (m==1) {
                            $("[name='nickName']").val("用户名已存在！");
                            $("[name='nickName']").focus().select();
                        } else{

                        }
                    },"json"
                );
            });*/
            $("[name='phone']").blur(function(){
                var phoneNum=$("[name='phone']").val();
                $.post("/checkPhone",{"phone":phoneNum},
                    function(n){
                        var m=parseInt(n);
                        if (m==1) {
                            $("[name='phone']").val("手机号已存在！");
                            $("[name='phone']").focus().select();
                        } else{

                        }
                    },"json"
                );
            });
            $("#button").click(function(){
                var phoneNum=$("[name='phone']").val();
                $.post("/reception",{"phone":phoneNum},
                    function(n){
                        var m=parseInt(n);
                        alert(m);
                        $("[name='code2']").val(m);
                    },"json"
                );
            });
        })
        function check() {
            var phoneNum=$("[name='phone']").val();
            var password=$("[name='password']").val();
            var repasswd=$("[name='pass2']").val();
            var tuijianren=$("[name='tuijianren']").val();
            var code=$("[name='code']").val();
            var code2=$("[name='code2']").val();
            var reg = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;
            if(!reg.test(phoneNum)){
                alert("输入格式必须为手机号");
                $("[name='phone']").val().clear();
                $("[name='phone']").focus().select();
                return false;
            }else if(!(password==repasswd)){
                alert("两次输入密码须保持一致");
                $("[name='pass2']").focus().select();
                return false;
            }else if(!reg.test(tuijianren)){
                alert("推荐人格式须为手机号");
                $("[name='tuijianren']").focus().select();
                return false;
            }else if(!(code==code2)){
                alert("验证码错误");
                return false;
            }else{
                return true;
            }
        }
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
      <a href="index.html" class="logo"><img src="images/logo.png"></a>
      <a href="login.html" class="ubut">退出</a>
      <a href="user_index.html" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>
      <nav>
          <a href="index.html">首页</a>
          <a href="about.ftl">基金</a>
          <a href="touzi_list.html" class="cur">理财</a>
          <a href="service.html">保险</a>

      </nav>
    </div>
</header>
<!----header e---->



<div class="login-banner" style="background:url(images/login_banner_bj.png) no-repeat center top;">

	<div class="lomain w">
    	<div class="wframe">
            <form action="/register" method="post">
                <div class="title" style="margin-top:10px;">30秒快速注册</div>
                <#--<input type="text" name="nickName" required placeholder="请输入用户名" autocomplete="off" class="input ph">-->
                <input type="text" name="phone" required placeholder="请输入正确的手机号码" autocomplete="off" class="input ph">
                <input type="password" name="password" required placeholder="请输入正确的密码" autocomplete="off" class="input ph">
                <input type="password" name="pass2" required placeholder="再次确认密码" autocomplete="off" class="input ph">
                <input type="text" name="tuijianren" required placeholder="请输入推荐人手机号" autocomplete="off" class="input ph">
                <input type="text" name="code" required placeholder="获取短信验证" autocomplete="off" class="input ph">
                <input type="hidden" name="code2" required placeholder="获取短信验证" autocomplete="off" class="input ph">
                <input type="button" id="button"  value="点击获取">
                <div class="tongyi"><i class="icon-0332"></i><a>我已阅读并同意<em>《使用协议》</em>及<em>《隐私条款》</em></a></div>
                <input type="submit" class="button" onclick="return check()" value="注   册">
                <div class="text2"><a href="/toLogin">使用账号密码登录</a></div>
                <form>
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
