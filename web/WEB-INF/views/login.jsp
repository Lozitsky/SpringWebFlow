<%--
  Created by IntelliJ IDEA.
  User: Надія
  Date: 21.06.2019
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Simple Login Page</title>
    <%--    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/reset.css">--%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/reset.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/structure.css' />">
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
</head>

<body>

<%--https://stackoverflow.com/questions/46989072/org-apache-jasper-jasperexception-web-inf-views-home-jsp-line-25-column/48364974--%>
<%--@elvariable id="user" type="com.kirilo.springMVC.models.User"--%>
<form:form method="post" modelAttribute="user" class="box login">
    <fieldset class="boxBody">
        <span style="float: right">
            <a href="?lang=en"><spring:message code="en"/></a>
            <a href="?lang=ru"><spring:message code="ru"/></a>
            <a href="?lang=ua"><spring:message code="ua"/></a>
        </span>
        <form:label path="name">
            <spring:message code="username"/>
        </form:label>
        <form:input path="name" placeholder="your name" required=""/>

        <form:label path="password">
            <spring:message code="password"/>
        </form:label>
        <form:password path="password" placeholder="your password" required=""/>

        <c:if test="${not empty message}">
            <span style="float: right" class="error">${message}</span>
        </c:if>

    </fieldset>
    <footer>
            <%--        <form:checkbox path="admin"/>
                    <form:label path="admin">Admin</form:label>--%>
        <a href="${flowExecutionUrl}&_eventId=createUser">
            <spring:message code="create_user"/> </a>

        <input type="submit" class="btnLogin"
               value="<spring:message code="login"/>"
               name="_eventId_submit" tabindex="4"/>

    </footer>
</form:form>

<footer id="main">
    <a href="https://github.com/Lozitsky/SpringWebFlow">Simple Login Page (HTML5/CSS3 Coded) </a>
</footer>


</body>
</html>
