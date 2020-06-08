/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.security.*;
import java.net.URLConnection;
import java.net.URL;
import java.net.URLDecoder; 
import java.io.PrintWriter;
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
public class HttpsSampleServlet extends HttpServlet
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) { 
  
    res.setContentType("text/html"); 
  
    // url passed in as browser query string 
    String url  = req.getParameter("https://mail.google.com/");
    if (null != url) 
      url = URLDecoder.decode(url); 
    else { 
      // url passed in as servlet init parameter 
      url = getInitParameter("https://mail.google.com/");
    } 

    URLConnection conn = null; 
    URL connectURL = null; 
  
    // send result to the caller 
    try { 

      PrintWriter out = res.getWriter(); 
      if (null == url || url.length() == 0) { 
        out.println("No Https URL provided to retrieve"); 
      } 
        else { 
          connectURL = new URL(url); 
          conn = connectURL.openConnection(); 
          DataInputStream theHTML = new DataInputStream(conn.getInputStream()); 
          String thisLine; 
          while ((thisLine = theHTML.readLine()) != null) { 
            out.println(thisLine); 
          } 
        } 
        out.flush(); 
        out.close(); 
      }
    catch (Exception e) { 
      System.out.println("Exception in HttpsSampleServlet: " + e.getMessage()); 
      e.printStackTrace(); 
    } 
  }//end goGet(...)
}
