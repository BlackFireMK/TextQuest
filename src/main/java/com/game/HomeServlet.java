package com.game;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");

        if (username != null && !username.trim().isEmpty()) {
            HttpSession session = req.getSession();
            req.getSession().setAttribute("username", username);

            Integer games = (Integer) session.getAttribute("numberOfGames");
            if (games == null && username != null) {
                games = 1;
                session.setAttribute("numberOfGames", games);
            }else {
                games++;
                session.setAttribute("numberOfGames", games);
            }
            req.getRequestDispatcher("WEB-INF/potionLesson.jsp").forward(req, resp);
        }else {
            resp.sendRedirect("index.jsp");
        }
    }
}