/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 *
 * @author Nitin
 */
@WebServlet(name="index2", urlPatterns={"/index"})
public class index2 extends HttpServlet {

    private long modTime;
private int[] numbers = new int[10];


    @Override
public void init() throws ServletException {
// Round to nearest second (i.e., 1000 milliseconds)
modTime = System.currentTimeMillis()/1000*1000;
for(int i=0; i<numbers.length; i++) {
numbers[i] = randomNum();
}
}
    @Override
    public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String title = "Your Lottery Numbers";
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
"we have chosen the " + numbers.length +
" best lottery numbers for you.</B>" +
"<OL>");
for(int i=0; i<numbers.length; i++) {
out.println(" <LI>" + numbers[i]);
}
out.println("</OL>" +
"</BODY></HTML>");
}
    @Override
    public long getLastModified(HttpServletRequest request) {
return(modTime);
}
// A random int from 0 to 99.
private int randomNum() {
return((int)(Math.random() * 100));
}
}
