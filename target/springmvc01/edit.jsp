<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/17
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/test/course/update" method="post">
        <input type="hidden" name="_method" value="PUT">
        <table>
            <tr>
                <td>编号:</td>
                <td>
                    <input type="text" name="id" readonly value="${course.id}">
                </td>
            </tr>
            <tr>
                <td>课程名称:</td>
                <td>
                    <input type="text" name="name" value="${course.name}">
                </td>
            </tr>
            <tr>
                <td>价格:</td>
                <td>
                    <input type="text" name="price" value="${course.price}">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="修改">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
