package com.game;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class Answer2Test {

    private Answer2 answer2;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setUp() {
        answer2 = new Answer2();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
    }

    @Test
    public void testDoPost_Yes() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("yes");
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("WEB-INF/potionLessonBook.jsp")).thenReturn(requestDispatcher);

        answer2.doPost(request, response);

        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoPost_No() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("no");
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("WEB-INF/final.jsp")).thenReturn(requestDispatcher);

        answer2.doPost(request, response);

        verify(request.getSession()).setAttribute("reply", "Ты принял не верное решение.");
        verify(requestDispatcher).forward(request, response);
    }
}