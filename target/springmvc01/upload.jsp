<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/18
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/test/file/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="img"/>
        <input type="submit" value="提交"/>
    </form>
    <img src="${src}"/>
    ${src}
</body>
</html>
