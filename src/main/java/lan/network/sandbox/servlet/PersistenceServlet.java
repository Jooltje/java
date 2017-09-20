package lan.network.sandbox.servlet;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lan.network.sandbox.entity.User;
import lan.network.sandbox.service.UserService;

@WebServlet(name = "PersistenceServlet", urlPatterns = {"/persistence"})
public class PersistenceServlet extends HttpServlet{
    
    @Inject
    private UserService userService;
    
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = userService.read(1);
        request.setAttribute("user", user);
        request.getRequestDispatcher("/WEB-INF/page/user.jsp").forward(request, response);
    }
}
