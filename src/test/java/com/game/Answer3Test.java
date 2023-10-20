package com.game;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Answer3Test {

    private Answer3 answer3;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setUp() {
        answer3 = new Answer3();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
    }

    @Test
    public void testDoPost_Yes() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("yes");
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("WEB-INF/win.jsp")).thenReturn(requestDispatcher);

        answer3.doPost(request, response);

        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoPost_No() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("no");
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("WEB-INF/final.jsp")).thenReturn(requestDispatcher);

        answer3.doPost(request, response);

        verify(request.getSession()).setAttribute("reply", "Ваше решение привело к провалу. Ваше зелье взрывается.");
        verify(requestDispatcher).forward(request, response);
    }
}