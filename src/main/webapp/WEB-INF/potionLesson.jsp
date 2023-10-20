<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Хогвартс - игра</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body style="background-image: url('hogwarts1.jpg');">
<h1>Урок зельеварения: Подготовка</h1>
<p>Вы находитесь на уроке зельеварения. Что вы выберете?</p>
<form action="answer1" method="post">
    <input type="radio" name="answer" value="yes" checked> Готовиться к уроку<br>
    <input type="radio" name="answer" value="no"> Общаться с сокурсниками<br>
    <br>
    <input type="submit" value="Ответить">
</form>
<div class="table-frame">
    <h4>Статистика:</h4>
    <h5>IP: <%= request.getRemoteAddr() %></h5>
    <h5>Имя в игре: <%= session.getAttribute("username") %></h5>
    <h5>Количество игр: <%= session.getAttribute("numberOfGames") %></h5>
</div>
</body>
</html>