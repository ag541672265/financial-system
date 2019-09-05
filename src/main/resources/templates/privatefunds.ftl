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
        <th>名字</th>
        <th>金额</th>
        <th>操作</th>
    </tr>
    <#list fundsList as flist>
        <#if flist.getMoney()!=0>
            <tr>
                <td><a href="/chajijin?fid=${flist.getFid()}">${flist.getFid()}</a></td>
                <td>
                    <#list funds as fs>
                        <#if fs.fid=flist.fid>
                            ${fs.fname}
                        </#if>
                    </#list>
                </td>
                <td>${flist.getMoney()}</td>
                <td>
                    <form action="/maichujijin"  method="post">
                        <input type="hidden" name="fid" value="${flist.getFid()}">
                        <input type="text" name="money">
                        <input type="submit" value="赎回">
                    </form>
                </td>
            </tr>
        </#if>
    </#list>
</table>
</body>
</html>