package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<TITLE>Login</TITLE>\n");
      out.write("<BODY>\n");
      out.write("<FORM ACTION=\"https://localhost:8080/WebApplication5/LoginHandler\" METHOD=POST>\n");
      out.write("<CENTER>\n");
      out.write("<TABLE BORDER=0>\n");
      out.write("<TR><TD COLSPAN=2>\n");
      out.write("<P ALIGN=center>\n");
      out.write("Welcome!  Please enter your Name<br>\n");
      out.write(" and Password to log in.\n");
      out.write("</TD></TR>\n");
      out.write("\n");
      out.write("<TR><TD>\n");
      out.write("<P ALIGN=right><B>Name:</B>\n");
      out.write("</TD>\n");
      out.write("<TD>\n");
      out.write("<P><INPUT TYPE=text NAME=\"name\" VALUE=\"\" SIZE=15>\n");
      out.write("</TD></TR>\n");
      out.write("\n");
      out.write("<TR><TD>\n");
      out.write("<P ALIGN=right><B>Password:</B>\n");
      out.write("</TD>\n");
      out.write("<TD>\n");
      out.write("<P><INPUT TYPE=password NAME=\"passwd\" VALUE=\"\" SIZE=15>\n");
      out.write("</TD></TR>\n");
      out.write("\n");
      out.write("<TR><TD COLSPAN=2>\n");
      out.write("<CENTER>\n");
      out.write("<INPUT TYPE=submit VALUE=\"  OK   \">\n");
      out.write("</CENTER>\n");
      out.write("</TD></TR>\n");
      out.write("</TABLE>\n");
      out.write("</BODY></HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
