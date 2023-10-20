<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Question2:</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <h2>Ты принял вызов. Поднимешься на мостик к капитану?</h2>
</head>
<body>
<form action="answer2" method="post">
    <input type="radio" name="answer" value="yes" checked> Подняться на мостик<br>
    <input type="radio" name="answer" value="no"> Отказаться подниматься на мостик<br>
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
