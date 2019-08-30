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
    <script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
    <!--
    <script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
    <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
    <script src="https://img.hcharts.cn/highcharts/themes/grid-light.js"></script>
    -->
</head>

<body>

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
        <a href="/toLogin" class="ubut">退出</a>
        <a href="user_index.html" class="ubut" style="padding:0 15px;">个人中心<span>我的资产<dl>${user.balance}</dl></span></a>
        <nav>
            <a href="index.html">首页</a>
            <a href="about.html">关于汇创</a>
            <a href="toTouzi_list" class="cur">投资理财</a>
            <a href="service.html">项目支持</a>
            <a href="news_list.html">信息披露</a>
        </nav>
    </div>
</header>
<!----header e---->



<!---user top s---->
<div class="user-top">

    <div class="userinfo">

        <a href="" class="portrait" style="margin-top:10px;"><em>编辑头像</em><img src="images/user-portrait.jpg"></a>
        <div class="minfo" style="margin-top:30px;">
            <div class="it"><dl>ID：</dl><span class="mr1">${user.account}</span> <dl>用户名：</dl><span>${user.nickName}</span></div>
            <div class="it">
                <dl>绑定手机号：</dl><span>${user.phone}</span>
                <a class="ml1" title="手机"><i class="icon-0566"></i></a>
                <a class="ml1" title="QQ"><i class="icon-0069"></i></a>
                <a class="ml1" title="微信"><i class="icon-0061"></i></a>
                <a class="ml1" title="淘宝"><i class="icon-0064"></i></a>
                <a href="user_account.html" class="ml1" title="设置"><i class="icon-0421"></i></a>
            </div>
        </div>

        <div class="capital">
            <dl>我的总资产</dl><em>${user.balance}</em>
        </div>
        <div class="capital2">
            <a href="" class="ti">提现</a>
        </div>

    </div>

    <div class="nav">
        <a href="user_index.html" class="l"><i class="icon-0101"></i><span>我的项目</span></a>
        <a href="user_account.html" class="l"><i class="icon-0423"></i><span>账户设置</span></a>
        <a href="/toLogin" class="r"><i class="icon-0735"></i><span>退出</span></a>
    </div>

</div>

<!---user top e---->
<div class="u-main">

    <div id="container" style="width:700px;height:400px; margin-top:20px; float:left;"></div>

    <div class="zsdata">
        <h1>百赚利滚利版(嘉实活期宝)</h1>
        <div class="text"><span>投资金额</span><em style="color:#666">￥263.00</em></div>
        <div class="text"><span>日盈利率</span><em>0.27%</em></div>
        <div class="text"><span>已收益额度</span><em>￥26.00</em></div>
        <a href="" class="but">增投申请</a>
        <a href="" class="but">体现申请</a>
    </div>

</div>
<script>
    $(function () {

        $('#container').highcharts({

            chart: {
                type: 'area',
                spacingBottom: 30
            },
            title: {
                text: '投资项目编号：20180726001'
            },
            subtitle: {
                text: '汇创点投走势图',
                floating: true,
                align: 'right',
                verticalAlign: 'bottom',
                y: 15
            },
            /*
            legend: {
                layout: 'vertical',
                align: 'left',
                verticalAlign: 'top',
                x: 150,
                y: 100,
                floating: true,
                borderWidth: 1,
                backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'
            },
            */
            xAxis: {
                categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
            },

            yAxis: {
                title: {
                    text: 'HUICHUANG'
                },
                labels: {
                    formatter: function () {
                        return this.value;
                    }
                }
            },
            //数据点提示框
            tooltip: {
                pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
            },
            tooltip: {
                valueSuffix: '%',//数据的后辍
                style:{color:'#000',}
            },
            /*
            tooltip: {
                formatter: function () {
                    return '<b>' + this.series.name + '</b><br/>' +
                        this.x + ': ' + this.y;
                }
            },
            */
            plotOptions: {
                area: {
                    fillOpacity: 0.5
                }
            },
            credits: {
                enabled: false
            },
            series: [{
                name: '月盈利率',
                data: [1.3,3.6,null,null,null,null,null,null,8.2,2.16,null,null]
            }]
        });
    });
</script>


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
</html>
