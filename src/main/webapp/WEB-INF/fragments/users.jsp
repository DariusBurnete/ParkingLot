<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<t:pageTemplate pageTitle="Users">

<h1>Users</h1>

    <form method="POST" action="${pageContext.request.contextPath}/Users">
        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
            <a href="${pageContext.request.contextPath}/AddUser" class="btn btn-primary btn-lg">Add User</a>
        </c:if>
        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
            <button type="submit" class="btn btn-secondary">Invoice</button>
        </c:if>

        <div class="container text-center">
            <c:forEach var="user" items="${users}">
                <div class="row">
                    <div class="col">
                        <label>
                            <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
                                <input type="checkbox" name="user_ids" value="${user.id}"/>
                            </c:if>
                        </label>
                    </div>
                    <div class="col">
                            ${user.username}
                    </div>
                    <div class="col">
                            ${user.email}
                    </div>
                </div>
            </c:forEach>
        </div>
    </form>

    <c:if test="${not empty invoices}">
        <h2>Invoices</h2>
        <c:forEach var="username" items="${invoices}" varStatus="status">
            ${status.index + 1}. ${username}
            <br>
        </c:forEach>
    </c:if>
</t:pageTemplate>