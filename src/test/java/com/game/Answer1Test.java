package com.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import static org.mockito.Mockito.*;

class Answer1Test {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher requestDispatcher;

    private Answer1 answer1;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        answer1 = new Answer1();
    }
    @Test
    public void testRedirectToQuestion2WhenYes() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("yes");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/potionLessonGame.jsp")).thenReturn(requestDispatcher);

        answer1.doPost(request, response);
        verify(requestDispatcher).forward(request, response);
    }
    @Test
    public void testRedirectToFinalWhenNo() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("no");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/final.jsp")).thenReturn(requestDispatcher);

        answer1.doPost(request, response);
        verify(session).setAttribute("reply", "Ты не готов к уроку.");
        verify(requestDispatcher).forward(request, response);
    }

}