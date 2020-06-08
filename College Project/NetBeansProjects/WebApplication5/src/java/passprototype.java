/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.net.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nitin
 */
public class passprototype extends Applet
   {
        public TextField value;
       public static String sa;
       Panel input= new Panel() ;
    
       public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Page7";
         out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<HTML><HEAD><TITLE>Page7</TITLE></HEAD>\n");
      out.write("<br>\n");
      out.write("\n");
        input.add(new TextField(30));
                sa=URLEncoder.encode(value.getText());
                //out.write(input);
                
                out.write("\n<form action ='https://localhost:8181/WebApplication5/passprototype2' method='post'>\n"
                        + "\n <input type='button' name='pres'> </form></body>\n</html>");

     }
     
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
doGet(request, response);
}


}
   
