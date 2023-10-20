package com.game;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/answer2")
public class Answer2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("answer");
        if (answer.equals("yes")) {
            req.getRequestDispatcher("WEB-INF/potionLessonBook.jsp").forward(req, resp);
        } else if (answer.equals("no")) {
            req.getSession().setAttribute("reply", "Ты принял не верное решение.");
            req.getRequestDispatcher("WEB-INF/final.jsp").forward(req, resp);
        }
    }
}
