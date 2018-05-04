import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher requestDispatcher;
        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword");

        Cookie user = new Cookie("user",username);
        Cookie pass = new Cookie("pass",password);
        if (request.getParameter("chkRemember") != null) {
            user.setMaxAge(60 * 60 * 24);
            pass.setMaxAge(60 * 60 * 24);
        } else {
            session.setAttribute("user",username);
            user.setMaxAge(0);
            pass.setMaxAge(0);
        }

        if ("khoand".equals(username) && "123".equals(password)) {
            session.setAttribute("user", username);
            response.addCookie(user);
            response.addCookie(pass);
            requestDispatcher = request.getRequestDispatcher("success.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("login.jsp");
            session.setAttribute("message", "error");
        }
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
