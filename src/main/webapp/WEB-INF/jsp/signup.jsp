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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<br>
<div class="card">
    <div class="card-body">
        <h4 class="card-header bg-primary text-white">Please Signup</h4>
        <br>
        <form:form modelAttribute="user">
            <form:errors cssClass="error" />
            <div class="form-group">
                <form:label path="email">Email address</form:label>
                <form:input path="email" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" />
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                <form:errors path="email" cssClass="error" />
            </div>
            <div class="form-group">
                <form:label path="name">Name</form:label>
                <form:input path="name" type="text" class="form-control" id="name" aria-describedby="nameHelp" placeholder="Name" />
                <small id="nameHelp" class="form-text text-muted">Please write your full name.</small>
                <form:errors path="name" cssClass="error" />
            </div>
            <div class="form-group">
                <form:label path="password">Password</form:label>
                <form:input path="password" type="password" class="form-control" id="password" placeholder="Password" />
                <form:errors path="password" cssClass="error" />
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
</div>



<%@ include file="includes/footer.jsp"%>