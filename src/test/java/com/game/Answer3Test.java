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

class Answer3Test {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher requestDispatcher;

    private Answer3 answer3;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        answer3 = new Answer3();
    }
    @Test
    public void testRedirectToWinWhenYes() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("yes");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/win.jsp")).thenReturn(requestDispatcher);

        answer3.doPost(request, response);
        verify(requestDispatcher).forward(request, response);
    }
    @Test
    public void testRedirectToFinalWhenNo() throws ServletException, IOException {
        when(request.getParameter("answer")).thenReturn("no");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/final.jsp")).thenReturn(requestDispatcher);

        answer3.doPost(request, response);
        verify(session).setAttribute("reply", "Ваше решение привело к провалу. Ваше зелье взрывается.");
        verify(requestDispatcher).forward(request, response);
    }

}