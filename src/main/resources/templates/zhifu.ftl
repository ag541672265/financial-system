<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <link rel="stylesheet" href="css/zhifu.css"/>
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        $(function(){

                $("[name='tiJiao']").click(function(){
                    var jine=$("[name='jine']").val();
                        alert(jine);
                    if(jine==""||jine==null){
                        alert("请输入金额！");
                        return false;
                    }

                });
        })
    </script>
</head>
<body>
    <div class="zhifu">
        <form action="/toPay" method="post">
                 <input type="text" name="jine" value="" class="in1"/>
                 <input type="submit" name="tiJiao" value="下一步" class="in2"/>
        </form>
    </div>
</body>
</html>