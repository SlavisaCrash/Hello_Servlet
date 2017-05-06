import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Slavisa on 04/27/17.
 */

public class HelloServlet extends HttpServlet {

    public void init() throws ServletException {

        System.out.println("In HelloServlet init() method");
    }
    public void destroy() {

        System.out.println("In HelloServlet destroy() method");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("We are in doGet method");

    }
}
