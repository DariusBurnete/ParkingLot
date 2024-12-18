<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="addUser">

    <body class="bg-light">

    <div class="container">
        <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}/AddUser">
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="" value="" required>
                    <div class="invalid-feedback">
                        Username is required.
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="text" class="form-control" id="email" name="email" placeholder="" value="" required>
                    <div class="invalid-feedback">
                        Email is required.
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="text" class="form-control" id="password" name="password" placeholder="" value="" required>
                    <div class="invalid-feedback">
                        Password is required.
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="user_groups" class="form-label">Owner</label>
                    <select class="form-select" id="user_groups" name="user_groups" multiple>
                        <c:forEach var="user_group" items="${userGroups}" varStatus="status">
                            <option value="${user_group}">${user_group}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        Please select a valid owner.
                    </div>
                </div>
            </div>
            <hr class="mb-4"></hr>

            <button type="submit" class="btn btn-primary">Save</button>
        </form>
    </div>

</t:pageTemplate>

