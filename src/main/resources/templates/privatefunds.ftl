<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>自己拥有的基金</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>金额</th>
        <th>操作</th>
    </tr>
    <#list fundsList as flist>
        <tr>
            <td><a href="/chajijin?fid=${flist.getFid()}"></a>${flist.getFid()}</td>
            <td>${flist.getMoney()}</td>
            <td>
                <form action="/maichujijin"  method="post">
                    <input type="hidden" name="fid" value="${flist.getFid()}">
                    <input type="text" name="money">
                    <input type="submit" value="提交">
                </form>
            </td>
        </tr>
    </#list>
</table>
</body>
</html>