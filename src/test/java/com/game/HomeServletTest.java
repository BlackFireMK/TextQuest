package com.game;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class HomeServletTest {

    private HomeServlet homeServlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

    @Before
    public void setUp() {
        homeServlet = new HomeServlet();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
        session = Mockito.mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
    }

    @Test
    public void testDoPost_WithUsername() throws ServletException, IOException {

        when(request.getParameter("username")).thenReturn("John Doe");

        homeServlet.doPost(request, response);

        verify(session).setAttribute("username", "John Doe");
    }

    @Test
    public void testDoPost_EmptyUsername() throws ServletException, IOException {
        when(request.getParameter("username")).thenReturn("");

        homeServlet.doPost(request, response);

        verify(session, never()).setAttribute(Mockito.anyString(), Mockito.anyString());
    }
}