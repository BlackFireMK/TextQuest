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

public class WinTest {

    private Win winPage;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setUp() {
        winPage = new Win();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("win.jsp")).thenReturn(requestDispatcher);

        winPage.doGet(request, response);

        verify(requestDispatcher).forward(request, response);
    }
}
