import controllers.PotionLessonServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PotionLessonServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private PrintWriter printWriter;

    private PotionLessonServlet potionLessonServlet;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        potionLessonServlet = new PotionLessonServlet();
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        when(request.getParameter("playerName")).thenReturn("Harry Potter");
        when(request.getParameter("house")).thenReturn("Gryffindor");
        when(request.getParameter("lessonChoice")).thenReturn("prepare");

        // Действия, производимые в методе doPost
        potionLessonServlet.doPost(request, response);

        // Проверка выполнения необходимых действий в методе
        verify(request).getParameter("playerName");
        verify(request).getParameter("house");
        verify(request).getParameter("lessonChoice");

        // Проверка отправки ответа на запрос
        verify(response).setContentType("text/html");
        verify(response).setStatus(HttpServletResponse.SC_OK);
        verify(response).getWriter();
        verify(printWriter).println("<h1>Preparing Potion Lesson</h1>");
        verify(printWriter).println("<p>Welcome, Harry Potter from Gryffindor!</p>");
        verify(printWriter).println("<p>Today's lesson is preparing potions.</p>");

        // Проверка закрытия PrintWriter
        verify(printWriter).close();
    }
}
