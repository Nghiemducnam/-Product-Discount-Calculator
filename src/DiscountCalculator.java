import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "DiscountCalculator", urlPatterns = "/calculate")
public class DiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Production description");
        int listPrice = Integer.parseInt(request.getParameter("List price"));
        int discountPercent = Integer.parseInt(request.getParameter("Discount percent"));
        int discountAmount = discountPercent*(listPrice/100);
        int discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>description: " + description+"</h1>");
        writer.println("<h1>Price: " +listPrice+"</h1>");
        writer.println("<h1>Discount Amount: "+discountAmount+"</h1>");
        writer.println("<h1>DiscountPercent: "+discountPercent+ " % "+"</h1>");
        writer.println("<h1>Discount Price: " + discountPrice+"</h1>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
