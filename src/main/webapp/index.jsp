<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Хогвартс - игра</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="background-image: url('hogwarts.jpg');">
<h1>Приветствие</h1>
<h2>Добро пожаловать в увлекательный мир Хогвартса - школы магии и волшебства!</h2>
<h2> Здесь вас ждут удивительные приключения и загадочные уроки.</h2>
<h2> Выйдите за пределы обычной реальности и окунитесь в мир магических существ,</h2>
<h2> волшебных заклинаний и дружбы.</h2>

<br>
<h3>Вы - юный маг или волшебница, которая только начинает свой путь в этом фантастическом мире.</h3>
<h3>Вас ждет множество испытаний, наставлений и возможностей для проявления таланта</h3>
<h3>и раскрытия своего магического потенциала.</h3>

<br>
<form action="home" method="post">
    <label>Введите имя персонажа:</label>
    <input type="text" name="username" >
    <br>
    <label for="characterHouse">Выберите свой дом:</label>
    <select id="characterHouse" name="characterHouse" required>
        <option value="Гриффиндор">Гриффиндор</option>
        <option value="Хаффлпафф">Хаффлпафф</option>
        <option value="Рэвенкло">Рэвенкло</option>
        <option value="Слизерин">Слизерин</option>
    </select>
    <input type="submit" value="Представиться">
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>