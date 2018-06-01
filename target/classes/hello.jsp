<%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2018/6/1
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<%@page isELIgnored="false"%>
<html>
<head>
    <title>aa</title>
</head>
<body>


<table>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>

    <s:iterator value="#session.list" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
        </tr>
    </s:iterator>

</table>
</body>
</html>
