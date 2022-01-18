<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/18
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>学生登录</h1>
    <form:form modelAttribute="student" action="/test/validate/login" method="post">
        学生姓名：<from:input path="name"></from:input><form:errors path="name"></form:errors><br/>
        学生密码:<from:input path="password"></from:input><form:errors path="password"></form:errors><br/>
        <input type="submit" value="提交"/>
    </form:form>

</body>
</html>
