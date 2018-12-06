<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 刘青龙
  Date: 2018/12/5
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="cn">
<head>
    <title>管理首页</title>
</head>
<body>

<div id="l" class="text">
    <img src="bb.jpg" alt="">
    <div align="right"><a href="#" class="text1">[修改密码]</a><a href="#">[安全退出]</a></div>
</div>


<table width="977">
    <th>管理首页 </th>
    <td width="240">
            <img src="jump.gif" alt=""><a href="#">管理员设置</a><br>
            <img src="jump.gif" alt=""><a href="#">后台登录日志</a><br>
            <img src="jump.gif" alt=""><a href="#">图书类别管理</a><br>
            <img src="jump.gif" alt=""><a href="#">图书信息管理</a><br>
            <img src="jump.gif" alt=""><a href="#">增加图书信息</a><br>
            <img src="jump.gif" alt=""><a href="#">图书查询信息</a><br>
            <img src="jump.gif" alt=""><a href="#">会员信息设置</a><br>
            <img src="jump.gif" alt=""><a href="#">增加会员信息</a><br>
            <img src="jump.gif" alt=""><a href="#">图书借阅管理</a><br>
            <img src="jump.gif" alt=""><a href="#">增加借阅信息</a><br>
            <img src="jump.gif" alt=""><a href="#">读者借阅查询</a><br>
    </td>
    <td width="720">
        <table  border="1px" width="100%">
            <tr>
                <th>序号</th>
                <th>图书类别</th>
                <th>录入时间</th>
                <th>删除</th>
            </tr>
            <c:forEach var="user" items="${ulist}">

                <tr>

                    <td>${user.序号}</td>
                    <td>${user.图书类别}</td>
                    <td>${user.录入时间}</td>
                    <td>${user.删除}</td>
                </tr>

            </c:forEach>


        </table>

    </td>

</table>


</body>
</html>
