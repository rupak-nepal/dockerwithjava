<html xmlns:th="http://www.thymeleaf.org" xmlns:tiles="http://www.thymeleaf.org">
<head>
    <title tiles:fragment="title">SpringBootModularApplicationDesign</title>
</head>
<body>
<div >
    <form action="${mvc.contextPath}/login" method="post">
      <%--With problem.--%>
        <fieldset>
            <label for="userId">Username</label>
            <input type="text" id="userId" name="userId"/>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
            <div class="form-actions">
                <button type="submit" class="btn">Log in</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>