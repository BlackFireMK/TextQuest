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

class HomeServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher requestDispatcher;

    private HomeServlet homeServlet;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        homeServlet = new HomeServlet();
    }
    @Test
    public void testValidUserNameAndNumberOfGames() throws ServletException, IOException {
        when(request.getParameter("username")).thenReturn("John Doe");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/potionLesson.jsp")).thenReturn(requestDispatcher);

        homeServlet.doPost(request, response);

        verify(session).setAttribute("username", "John Doe");
        verify(session).setAttribute("numberOfGames", 1);
        verify(requestDispatcher).forward(request, response);
    }

}