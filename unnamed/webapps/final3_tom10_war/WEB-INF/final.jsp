<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Конец</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Проиграл!!!</h1>
<br>
<h2><%= session.getAttribute("reply") %></h2>
<form action="final" method="get">
    <input type="submit" value="Начать заново!">
</form>
</body>
</html>
