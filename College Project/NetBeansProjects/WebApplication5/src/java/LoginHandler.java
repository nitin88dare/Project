/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nitin
 */
public class LoginHandler extends HttpServlet {
    @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res)
                                throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    // Get the user's name and password
    String name = req.getParameter("name");
    String passwd = req.getParameter("passwd");

    // Check the name and password for validity
    if (!allowUser(name, passwd)) {
      out.println("<HTML><HEAD><TITLE>Access Denied</TITLE></HEAD>");
      out.println("<BODY>Your login and password are invalid.<BR>");
      out.println("You may want to <A HREF=\"/login.html\">try again</A>");
      out.println("</BODY></HTML>");
    }
    else {
      // Valid login. Make a note in the session object.
      HttpSession session = req.getSession(true);
      session.putValue("logon.isDone", name);  // just a marker object

      // Try redirecting the client to the page he first tried to access
      try {
        String target = (String) session.getValue("login.target");
        if (target != null)
          res.sendRedirect(target);
        return;
      }
      catch (Exception ignored) { }

      // Couldn't redirect to the target. Redirect to the site's home page.
      res.sendRedirect(req.getScheme() + "://" +
                       req.getServerName() + ":" + req.getServerPort());
    }
  }

  protected boolean allowUser(String user, String passwd) {
    return true;  // trust everyone
  }
   }
