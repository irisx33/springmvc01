<%--
  Created by IntelliJ IDEA.
  User: 64201
  Date: 2022/1/19
  Time: 10:16
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
    <h1>用户注册</h1>
    <form:form modelAttribute="account" action="/test/validate/register" method="post">
        用户名：<from:input path="username"></from:input><form:errors path="username"></form:errors><br/>
        密码:<from:input path="password"></from:input><form:errors path="password"></form:errors><br/>
        邮箱:<from:input path="email"></from:input><form:errors path="email"></form:errors><br/>
        电话：<from:input path="phone"></from:input><form:errors path="phone"></form:errors><br/>
        <input type="submit" value="提交"/>
    </form:form>
</body>
</html>
