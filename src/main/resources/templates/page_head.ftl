
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
            <a href="/register" class="topbut">注册</a>
            <a href="/login" class="topbut-cur">登录</a>
    </#if>
    <nav>
    	<a href="/index" class="cur">首页</a>

        <a href="/fund">基金</a>
        <a href="/fProducts">理财</a>
        <a href="/insurance">保险</a>
        <a href="news_list.html">汇金红</a>

    </nav>
</header>
<!----header e---->


