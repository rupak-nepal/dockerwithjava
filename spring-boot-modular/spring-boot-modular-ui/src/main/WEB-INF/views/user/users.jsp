<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Users</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="/css/main.css" th:href="@{/css/main.css}" />
</head>
<body>
<div th:substituteby="index::logout"></div>
<h1>This is a login page! man </h1>
<p><a href="/index" th:href="@{/index}">Back to home page</a></p>
</body>
</html>