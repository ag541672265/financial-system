<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<meta charset="utf-8">
<title>汇添金</title>
<meta name="keywords" content="汇添金" />
<meta name="description" content="汇添金" />
<#--<link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>-->
<link rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="css/index.css"/>
<link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.9.0.js"></script>
<#--<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>-->
</head>

<body>

<!----header s---->
<#include "./page_head.ftl" />
<!----header e---->




<!--focus start-->
<#--变动使用jquery修改-->
<div class="focus" id="focus">
	
    <div class="login_box w">
		<div class="login">
        	<div class="title">汇金红</div>
            <div class="nllv">3.351%</div>
            <div class="txt">月盈利率</div>
            <a onclick="shoenlistDiv(this)" pronum="7" class="jiabut">立即申请</a>
            <div class="txt" style="margin-top:20px;color:#333;">汇添金为您推荐产品</div>
		</div>
	</div>

    <#--滚动图片-->
	<div id="focus_m" class="focus_m">
		<ul>
			<li class="li_1" style="background:url(images/picc3.jpg) center 0 no-repeat #288cc0;"><a href="#" hidefocus="true"></a></li>
			<li class="li_2" style="background:url(images/2.jpg) center 0 no-repeat #76b7d8;"><a href="#" hidefocus="true"></a></li>
			<li class="li_3" style="background:url(images/3.jpg) center 0 no-repeat #bb3838;"><a href="#" hidefocus="true"></a></li>
			<li class="li_3" style="background:url(images/1.jpg) center 0 no-repeat #bb3838;"><a href="#" hidefocus="true"></a></li>
		</ul>
	</div>
	<a href="javascript:;" class="focus_l" id="focus_l" hidefocus="true" title="上一张"><b></b><span></span></a>
	<a href="javascript:;" class="focus_r" id="focus_r" hidefocus="true" title="下一张"><b></b><span></span></a>
</div>
<!--focus end-->



<div class="in-motice">
	<div class="conmain w">
    	<i class="icon-0724"></i>
        <a href="" class="title">最新公告：安港最近发财了，要请大家吃饭！欢迎欢迎</a>
        <a href="" class="more"><span>查看更多</span><i class="icon-0244"></i></a>
    </div>
</div>


<div class="datanav w">
	<#--<div class="txt"><span>项目路演</span><em>101</em><span>场</span></div>-->
    <div class="txt"><span>交易金额</span><em>2.02</em><span>亿</span></div>
    <div class="txt"><span>投资收益</span><em>5316</em><span>万</span></div>
    <div class="txt"><span>服务用户</span><em>5703</em><span>位</span></div>
</div>

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


<!---invest-title s--->
<div class="invest-title"><dl></dl><span class="tx">投资项目</span><dl></dl></div>
<div class="invest-list w">

  <div class="item">
  		<div class="mask"></div>
        <div class="nhl">年化盈利率：<span>2.78%</span></div>
    	<div class="pic"><img src="images/pro-1.jpg"></div> 
        <a onclick="shoenlistDiv(this)" pronum="1" class="joinbut">立即申请</a>
        <div class="title">最新投资理财项目</div>
        <div class="con">
        	<span class="l">筹资金额：</span><em>1788 </em> <span class="l"> 元</span>
            <dl>已完成</dl><span class="r">状态：</span>
        </div>
  </div>
  
  <div class="item">
  		<div class="mask"></div>
        <div class="nhl">年化盈利率：<span>2.78%</span></div>
    	<div class="pic"><img src="images/pro-1.jpg"></div> 
        <a  onclick="shoenlistDiv(this)" pronum="2" class="joinbut">立即申请</a>
        <div class="title">最新投资理财项目</div>
        <div class="con">
        	<span class="l">筹资金额：</span><em>1788 </em> <span class="l"> 元</span>
            <dl>已完成</dl><span class="r">状态：</span>
        </div>
  </div>
  
  <div class="item">
  		<div class="mask"></div>
        <div class="nhl">年化盈利率：<span>2.78%</span></div>
    	<div class="pic"><img src="images/pro-1.jpg"></div> 
        <a  onclick="shoenlistDiv(this)" pronum="3" class="joinbut">立即申请</a>
        <div class="title">最新投资理财项目</div>
        <div class="con">
        	<span class="l">筹资金额：</span><em>1788 </em> <span class="l"> 元</span>
            <dl>已完成</dl><span class="r">状态：</span>
        </div>
  </div>

</div>
<!---invest-title e--->





<!---footer s--->
<#include "./page_foot.ftl"/>
<!---footer e--->
</body>
</html>
