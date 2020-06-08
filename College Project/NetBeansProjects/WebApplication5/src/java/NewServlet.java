


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet
{

  int numbers ;
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Your Lottery Numbers";
        
            numbers = (int)(Math.random() * 3);
       
        String docType =
        "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
        "Transitional//EN\">\n";
        out.println(docType +
        "<HTML>\n" +
        "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
        "<BODY BGCOLOR=\"#FDF5E6\">\n" +
        "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
        "<B>Based upon extensive research of " +
        "astro-illogical trends, psychic farces, " +
        "and detailed statistical claptrap, " +
        "we have chosen the " +
        " best lottery numbers for you.</B>" +
        "<OL>");
       
            out.println(" <LI>" + numbers);
        
        out.println("</OL>" +
        "</BODY></HTML>");
    }
   
}

