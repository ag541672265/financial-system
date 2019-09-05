<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>所有的基金</title>
</head>
<body >
<table>
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>操作</th>
    </tr>
    <#list fundsList as flist>
    <tr>
        <td>${flist.getFid()}</td>
        <td>${flist.getFname()}</td>
        <td>
            <form action="/mairujijin"  method="post">
                <input type="hidden" name="fid" value="${flist.getFid()}">
                <input type="hidden" name="type" value="9">
                <input type="text" name="money">
                <input type="submit" value="提交">
            </form>
        </td>
    </tr>
    </#list>
</table>

</body>
</html>