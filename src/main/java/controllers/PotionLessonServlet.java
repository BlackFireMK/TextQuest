package controllers;

import data_base.DataBase;
import entity.Player;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PotionLessonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String playerName = request.getParameter("playerName");

        // Получить игрока из базы данных или создать нового
        Player player = DataBase.getPlayer(playerName);
        if (player == null) {
            player = new Player(playerName);
            DataBase.savePlayer(player);
        }

        // Установить атрибут игрока в сессию
        request.getSession().setAttribute("player", player);

        // Установить стиль фона по умолчанию
        player.setBackgroundStyle("default-style");

        // Перенаправить на страницу следующего шага игры
        response.sendRedirect("potionLessonBook.jsp"); // Перенаправить на страницу справочника зельеварения
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
