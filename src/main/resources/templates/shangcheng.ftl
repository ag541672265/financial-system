<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<link rel="stylesheet" href="css/shangcheng.css">

    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        $(function(){
           $(".joinbut").click(function(){

               var gId=$(this).next().val();
               $("[name='gId']").val(gId);
                $(".applyMain").css("display","block");
               $(".fullscreenMask").css("display","block");

           });


            $(".guanBi").click(function(){
                $(".applyMain").css("display","none");
                $(".fullscreenMask").css("display","none");
            });

            $("#tj").click(function(){
                var reg=/^[1-9]{1,}[\d]*$/;

                var jine=$("[name='jine']").val();
                var money=$("[name='money']").val();
                if (!reg.test(jine)){
                    alert("请输入正确的金额数目！");
                } else{

                    if(parseFloat(jine)>parseFloat(money)){
                        alert("余额不足！");
                    }else{
                        $("form").submit();
                    }
                }
            });



            $("#qefk").click(function(){

                $.post("/queryYuE",
                        function(n){
                            var m=parseInt(n);
                    $("[name='jine']").val(n);
                        },"json"
                )
            });
        })
    </script>
</head>

<body>


<div class="invest-title"><dl></dl><span class="tx">投资项目</span><dl></dl></div>
<div class="invest-list w">

    <#list gList as g>
    <div class="item">
        <div class="mask"></div>
        <input type="hidden" name="gId" value="${g.getgRisk()}">
        <input type="hidden" name="gId" value="${g.getGid()}">
        <div class="nhl">年化盈利率：<span>${g.getgPrice()}</span></div>
        <div class="pic"><img src="images/pro-1.jpg"></div>
        <a  pronum="1" class="joinbut">立即申请</a>
        <input type="hidden" name="gId2" value="${g.getGid()}">
        <div class="title">${g.getgName()}</div>
    </div>
    </#list>
</div>

<div class="fullscreenMask" id="fullscreenMask" style="display:none;">
</div>
<form action="/toBuy" method="post">
<div class="applyMain" id="applyMain" style="display:none">
    <input type="hidden" name="gId" value="">
    <div class="title"><span>请填写申请信息</span><i class="icon-0310" ><img width="28px" class="guanBi" src="images/guanbi.png"></i></div>
    <input id="pronum" type="hidden" name="pronum" value="">
    <div class="txt" style="margin-top:30px;">您购买的期限：</div>
    <select name="tremDate" autocomplete="off" class="input">
        <option value="1" selected>一个月</option>
        <option value="2">三个月</option>
    </select>
    <div class="txt" style="margin-top:15px;">购买金额：</div>
    <input type="hidden" name="money" value="${money?c}">
    <input type="hidden" name="type" value="1">
    <input type="text" name="jine" required placeholder="请输入您的购买金额" autocomplete="off" class="input">
    <div class="txt" style="margin-top:15px;">投资意向情况说明：</div>
    <textarea name="comment"  placeholder="请输入投资意向情况说明" class="textarea"></textarea>
    <input type="button" class="button" id="tj" value="提   交"><input type="submit" class="button" id="qefk" value="全部购买">
</div>
</form>
</body>
</html>
