package by.mikhalevich.pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pattern")
public class Pattern extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Start Servlet!");

//        ServletContext context = getServletContext();
//        RequestDispatcher requestDispatcher0 = context.getRequestDispatcher("/result");
        RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("/result");

//        requestDispatcher0.include(req, resp);
        requestDispatcher1.forward(req, resp);
        

    }
}
