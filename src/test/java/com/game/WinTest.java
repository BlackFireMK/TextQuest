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

class WinTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher requestDispatcher;

    private Win win;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        win=new Win();
    }
    @Test
    public void testForwardToFinal() throws ServletException, IOException {
        when(request.getRequestDispatcher("index.jsp")).thenReturn(requestDispatcher);

        win.doGet(request, response);

        verify(requestDispatcher).forward(request, response);
    }

}
