import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addsub extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("a"));
int num2 = Integer.parseInt(request.getParameter("b"));
int sum = a + b;
int product = a * b;
int sub = a - b;
PrintWriter output = response.getWriter();
output.println("The Answer :"+sum +"\n The product :"+product+ "\nThe subtract :"+sub);
}
    }
