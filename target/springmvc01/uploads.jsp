<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/18
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/test/file/uploads" method="post" enctype="multipart/form-data">
        file1:<input type="file" name="imgs"/><br/>
        file1:<input type="file" name="imgs"/><br/>
        file1:<input type="file" name="imgs"/><br/>
        <input type="submit" value="提交"/>
    </form>
    <c:forEach items="${list}" var="path">
        <img width="300px" src="${path}">
    </c:forEach>
</body>
</html>
