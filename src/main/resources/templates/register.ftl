<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>汇创点投</title>
<meta name="keywords" content="汇创点投" />
<meta name="description" content="汇创点投" />
<link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>
<link rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="css/user.css"/>
<link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>

</head>

<body style="background-color:#f0f0f0;">

<!----header s---->
<div class="topnav">
	<div class="mainw w">
    <div class="l-txt">欢迎致电：400-0000-000 &nbsp;&nbsp; 服务时间：80:30-18:30（工作日）</div>
    <div class="wapbut">
   	  <span>手机端</span><i class="icon-0198"></i>
    	<div class="qrc"><img src="images/qrc.png"></div>
    </div>
    <a href="kefu.html" class="dh">在线客服</a>
    <a href="help.html" class="dh">帮助中心</a>
    <a href="xinshou.html" class="dh">新手指引</a>
    </div>
</div>

<header>
	<div class="hmain w">
      <a href="index.html" class="logo"><img src="images/logo.png"></a>
      <a href="login.html" class="ubut">退出</a>
      <a href="user_index.html" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>
      <nav>
          <a href="index.html">首页</a>
          <a href="about.html">关于汇创</a>
          <a href="touzi_list.html" class="cur">投资理财</a>
          <a href="service.html">项目支持</a>
          <a href="news_list.html">信息披露</a>
      </nav>
    </div>
</header>
<!----header e---->


<form action="addUser">
<div class="login-banner" style="background:url(images/login_banner_bj.jpg) no-repeat center top;">

	<div class="lomain w">
    	<div class="wframe">
       	  <div class="title" style="margin-top:10px;">30秒快速注册</div>
            <input type="text" name="nickName" id="nick" required placeholder="请输入用户名" autocomplete="off" class="input ph">
            <input type="text" name="phone" id="tel" required placeholder="请输入正确的手机号码" autocomplete="off" class="input ph">
            <button name="yan" id="zheng">获取验证码</button>
            <input type="text" name="yanzhengma" id="huoqu" required placeholder="验证码" autocomplete="off" class="input ph">
            <input type="password" name="password" id="pwd" required placeholder="请输入正确的密码" autocomplete="off" class="input ph">
            <input type="password" name="password2" id="pwd2" required placeholder="再次确认密码" autocomplete="off" class="input ph">
            <input type="text" name="tuiphone" id="tui" required placeholder="请输入推荐人电话" autocomplete="off" class="input ph">
            <div class="tongyi"><i class="icon-0332"></i><a>我已阅读并同意<em>《使用协议》</em>及<em>《隐私条款》</em></a></div>
   		  	<input type="submit" class="button" id="sub" value="登   录">


        </div>
    </div>

</div>
</form>




<!---footer s--->
<footer style="margin-top:0px;">
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
            	<div class="ewm"><img src="images/qrc.png"><span>添加我们的微信</span></div>
            	<div class="ewm" style="margin-left:20px;"><img src="images/qrc.png"><span>关注公众号</span></div>
            </div>
        </div>
        <div class="fm-bot">
        	<span>&copy; 2018 &nbsp;北京汇创点投科技有限公司 &nbsp;京ICP备：00000000号 </span>
            <dl>市场有风险 投资需谨慎</dl>
        </div>
    </div>
</footer>
<!---footer e--->


</body>

<script type="text/javascript">
    $(function(){
        var m;

        $("[name='yan']").click(function(){
            var phoneNum=$("[name='phone']").val();
            $.post("/getRandomNum",{"phone":phoneNum},
                function(n){
                    m=parseInt(n);

                },"json"
            );
        });
        $("[name='nickName']").blur(function(){
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
        });
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
        $("#sub").click(function () {
            var yanzhengma=$("[name='yanzhengma']").val();

            if (m!=yanzhengma) {
                alert("验证码错误");
                return false;
            }
            var p = $("#pwd").val();
            var p2 = $("#pwd2").val();
            if (p != p2) {
                alert("两次密码不对重新输入！");
                return false;
            }
            var phone= $("#tel").val();
            var tphone= $("#tui").val();
            var password= $("#pwd").val();
            var password2= $("#pwd2").val();
            var nickName= $("#nick").val();
            var zPhone=/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
            var zPassword=/^(\w){6,20}$/;
            var zNickName=/^.{3,20}$/;
            var ztuiphone=/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
            if (!zNickName.test(nickName)) {
                alert("名字格式不对重新输入！");
                return false;
            }
            if(!zPassword.test(password)){
                alert("密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)");
                return false;
            }
            if(!zPassword.test(password2)){
                alert("密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)");
                return false;
            }

            if(!zPhone.test(phone)){
                alert("手机号码格式不对");
                return false;
            }
            if(!zPhone.test(tphone)){
                alert("推荐手机号码格式不对");
                return false;
            }

        })
    })
</script>

</html>
