<%--
  Created by IntelliJ IDEA.
  User: 刘青龙
  Date: 2018/12/5
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
<link rel="stylesheet" href="color.css">
    <style>
<%--*{
    background-image: url("bg.jpg");
}--%>

    </style>

</head>
<body>

<div align="center">
    <h1>图书管理系统</h1>
    <div>
        <img src="index_hz01.gif" alt="">
    </div>
    <div id="login" >

        <form action="/login">

            <div align="left"  class="denglu" style="margin-left: 110px">

                账&#160&#160&#160号:
                <input type="text" name="uname"><br>
                密&#160&#160&#160码:
                <input type="password" name="pwd"><br>

              <%--
               验证码:
                <input type="text"  id="yanzhengma" style="width: 80px"> 3476<br>
              --%>



            </div>

            <div align="center">
                <input type="image" src="index_hz04.gif" alt="">
            </div>


        </form>


    </div>
</div>

</body>
</html>
