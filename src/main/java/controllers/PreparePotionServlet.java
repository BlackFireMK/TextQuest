package controllers;

import data_base.DataBase;
import entity.Player;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PreparePotionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String playerName = request.getParameter("playerName");
        String preparationType = request.getParameter("preparationType");
        String backgroundStyle = request.getParameter("backgroundStyle");

        // Получить игрока из базы данных
        Player player = DataBase.getPlayer(playerName);

        if (player != null && preparationType != null) {
            // Обновление данных игрока в соответствии с ответом на вопрос о приготовлении зелья
            player.setPreparationType(preparationType);
            player.setBackgroundStyle(backgroundStyle);
            // Сохранение обновленных данных игрока в базе данных
            DataBase.savePlayer(player);
        }

        // Перенаправить на страницу, соответствующую результату приготовления зелья
        if (player != null && player.getPreparationType() != null && player.getPreparationType().equals("book")) {
            response.sendRedirect("potionLessonResultSuccess.jsp"); // Перенаправить на страницу успешного приготовления
        } else {
            response.sendRedirect("potionLessonResultFailure.jsp"); // Перенаправить на страницу неудачного приготовления
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
