import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_calculator",urlPatterns = "/calculator")
public class Servlet_calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            float first_number =Float.parseFloat(request.getParameter("txt_first"));
           float second_number =Float.parseFloat(request.getParameter("txt_second"));
           char calculator =request.getParameter("select_").charAt(0);
        PrintWriter writer =response.getWriter();
        writer.println("<html>");

        Calculator calculator1 =new Calculator();
        try{
            float result =calculator1.calculator(first_number,second_number,calculator);
            writer.println("<h1> Result :"+result +"</h1>" );

        }catch(Exception e){
            writer.println("Erro:" +e.getMessage());
        }

            writer.println("</html");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
