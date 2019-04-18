<%--
  Created by IntelliJ IDEA.
  User: Gwk
  Date: 2019/3/29
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>listall</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${userList}" var="user">

            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.password}</td>
                <td width="300px">
                    <input type="button" value="详情">
                    <input type="button" value="修改">
                    <a href="/user/deleteById?id=${user.id}"><input type="button"  value="删除"></a>
                </td>
            </tr>
        </c:forEach>


        </tbody>
    </table>
</div>

</body>
</html>
