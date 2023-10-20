<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Question3:</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <h2>Ты поднялся на мостик. Ты кто?</h2>
</head>
<body>
<form action="answer3" method="post">
    <input type="radio" name="answer" value="yes" checked> Рассказать правду о себе<br>
    <input type="radio" name="answer" value="no"> Солгать о себе<br>
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
