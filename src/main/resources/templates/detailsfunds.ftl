<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>基金详情</title>
</head>
<body >
<table>
    <tr>
        <th>编号</th>
        <th>名字</th>
    </tr>
    <#list funds as f>
        <tr>
            <td>${f.getFid()}</td>
            <td>${f.getFname()}</td>
        </tr>
    </#list>
</table>
</body>
</html>
