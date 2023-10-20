<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Конец</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body style="background-image: url('final.jpg');">
<h1>Вас выгоняют с урока.</h1>
<br>
<h2>К сожалению, у вас недостаточно знаний для приготовления зелья.</h2>
<h2>Профессор выгоняет вас с урока с поражением. И ваш факультет проигрывает в гонке факультетов</h2>
<br>
<h3><%= session.getAttribute("reply") %></h3>
<form action="final" method="get">
    <input type="submit" value="Начать заново!">
</form>
</body>
</html>