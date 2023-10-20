<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Хогвартс - игра</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body style="background-image: url('hogwarts2.jpg');">
<h1>Урок зельеварения</h1>
<h2>Профессор: Настало время начать урок зельеварения!</h2>
<h2>Повторим некоторые знания о зелье 'Пузырчатая фитка'.</h2>
<h2>Какие ингредиенты нужны для приготовления этого зелья?</h2>
<form action="answer2" method="post">
    <input type="radio" name="answer" value="yes" checked> Листья мандрагоры и волокнистая кора<br>
    <input type="radio" name="answer" value="no"> Крыло феникса и паучий яд<br>
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