<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/14
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>show</h1>
<%--    ${user}--%>
    request:${requestScope.user}
    session:${sessionScope.user}
</body>
</html>