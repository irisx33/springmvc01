<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/17
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/test/rest/update" method="post">
        <input type="hidden" name="_method" value="PUT"/>
        <input type="submit" value="PUT提交">
    </form>

    <form action="/test/rest/delete" method="post">
        <input type="hidden" name="_method" value="DELETE"/>
        <input type="submit" value="DELETE提交">
    </form>
</body>
</html>
