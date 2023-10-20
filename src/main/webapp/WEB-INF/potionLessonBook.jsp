<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Продолжение урока зельеварения</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <h2>Профессор: Теперь настало время показать ваши способности.</h2>
    <h2>Приготовьте это зелье, на это у вас 30 мин.</h2>
    <h2>Я думаю, все понимают, что это ваш экзамен</h2>
    <h2>Кто не сможет приготовить его, ему здесь не место</h2>
</head>
<body style="background-image: url('hogwarts3.jpg');">
<form action="answer3" method="post">
    <input type="radio" name="answer" value="yes" checked> Вы решаете готовить зелье по рецепту в книге.<br>
    <input type="radio" name="answer" value="no"> Вы решаете подсмотреть у соседа по соседнему столу<br>
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