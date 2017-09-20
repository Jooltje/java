package lan.network.sandbox.servlet;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InjectionServlet", urlPatterns = {"/injection"})
public class InjectionServlet extends HttpServlet {

    @Inject
    private Message message;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("text", message.getText());
        request.getRequestDispatcher("/WEB-INF/page/message.jsp").forward(request, response);
    }


    
    
    
    
}
