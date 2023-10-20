<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Приветствие</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Пролог</h1>
<h4>Ты стоишь в космическом порту и готов подняться на борт</h4>
<h4>своего корабля. Разве ты не об этом мечтал? Стать капитаном</h4>
<h4>галактического судна с экипажем, который будет совершать</h4>
<h4>подвиги под твоим командованием.</h4>

<br>
<h2>Знакомство с экипажем</h2>

<h4>Знакомься, вот ваша помощница, штурман, бортмеханик и другие ребята...</h4>

<span style="color: #FFFFFF; font-family: Arial, sans-serif; margin-top: 20px; text-shadow: -1px -1px 0 #000, 1px -1px 0 #000, -1px 1px 0 #000, 1px 1px 0 #000;">
    <c:out value="Добро пожаловать на борт нашего галактического судна!" />
</span>

<form action="greeting" method="post">
    <input type="text" name="username" >
    <input type="submit" value="Представиться">
</form>
</body>
</html>