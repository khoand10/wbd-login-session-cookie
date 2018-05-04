import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "ServletIndex",urlPatterns = "/index")
public class ServletIndex extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        String user = "";
        String pass = "";
        for (Cookie c:cookies) {
            if(c.getName().equals("user")){
                user = c.getValue();
            }
        }
        if (user.equals("")){
            if(session.getAttribute("user")==null) {
                response.sendRedirect("login.jsp");
            }else{
                response.sendRedirect("success.jsp");
            }
        }else{
            response.sendRedirect("success.jsp");
        }
    }
}
