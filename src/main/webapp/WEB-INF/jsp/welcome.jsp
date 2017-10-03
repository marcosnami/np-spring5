<%--
  Created by IntelliJ IDEA.
  User: MarcosNami
  Date: 10/1/2017
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ include file="includes/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1><spring:message code="hello"/>, ${name}</h1>
<p>${text}</p>

<%@ include file="includes/footer.jsp"%>