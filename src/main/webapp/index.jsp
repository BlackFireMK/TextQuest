<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Хогвартс - игра</title>

</head>
<body class="centered" style="background-image: url('hogwarts.jpg');">
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

    <input type="submit" class="btn btn-success" value="Представиться">
</form>

</body>
</html>