<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Хогвартс - игра</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Урок зельеварения: Подготовка к зелью</h1>
<p>Вы находитесь на уроке зельеварения. Что вы выберете?</p>
<form action="potionLessonResult" method="post">
    <input type="hidden" name="playerName" value="${playerName}">
    <input type="hidden" name="house" value="${house}">
    <br>
    <input type="radio" id="prepare" name="lessonChoice" value="prepare">
    <label for="prepare">Готовиться к уроку</label>
    <br>
    <input type="radio" id="socialize" name="lessonChoice" value="socialize">
    <label for="socialize">Общаться с сокурсниками</label>
    <br>
    <input type="submit" value="Продолжить">
</form>
</body>
</html>