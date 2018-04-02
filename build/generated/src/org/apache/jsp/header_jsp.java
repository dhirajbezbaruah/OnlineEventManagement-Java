package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"header-block\" style=\"clear:both\">\n");
      out.write("                <div class=\"left-block\">\n");
      out.write("                    <div class=\"logotext\">WELCOME TO indiatours.com </div>\n");
      out.write("                    \n");
      out.write("                    <span class=\"tagline\">your search END here</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right-block\">\n");
      out.write("                 \n");
      out.write("          ");
 HttpSession nsession = request.getSession(false);
          String data=(String)session.getAttribute( "sessname" );
        // out.println(data);
         if(data!=null) {
         
      out.write("\n");
      out.write("         <input type=\"submit\" value=\"Logout\" onclick=\"location.href='logout'\" class=\"but\" />\n");
      out.write("         ");
}
        else
        {
      out.write("\n");
      out.write("            <div style=\"float: left\"><input class=\"but\" type=\"button\" onClick=\"location.href='Login.jsp'\"  value=\"Login\" name=\"three\" /></div>\n");
      out.write("            <div style=\"float: right\"><input class=\"but\" type=\"button\" onClick=\"location.href='Registeration.jsp'\"  value=\"Signup\" name=\"three\"/></div>\n");
      out.write("            <div style=\"float: middle\"><input class=\"but\" type=\"button\" onClick=\"location.href='Login.jsp'\"  value=\"Login\" name=\"three\" /></div>\n");
      out.write("            \n");
      out.write("        ");
 
           // out.println("Session is not active");
        }
        
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("   \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div> \n");
      out.write("            <div/>\n");
      out.write("           \n");
      out.write("            ");
      out.write("\n");
      out.write("           <div id='cssmenu'>\n");
      out.write("            <ul>\n");
      out.write("             <li ><a href='http://localhost:8084/indiatours/home.jsp'><span>Home</span></a></li>\n");
      out.write("             \n");
      out.write("             <li><a href='http://localhost:8084/indiatours/best_value_tour.jsp'><span>Best Value Tours</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8084/indiatours/hotel.jsp'><span>Hotels</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8084/indiatours/destination_information.jsp'><span>Destination Information</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8084/indiatours/book_your_own_tour.jsp'><span>Book Your Own Tour</span></a></li>\n");
      out.write("             <li class='last'><a href='http://localhost:8084/indiatours/contact_us.jsp'><span>Contact US</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8084/indiatours/aboutus.jsp'><span>About Us</span></a></li>\n");
      out.write("             <li><a href='posthotel.jsp'><span>Share your Hotel with Us</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           ");
      out.write("\n");
      out.write("     <div class=\"rslides_container\">\n");
      out.write("      <ul class=\"rslides\" id=\"slider1\">\n");
      out.write("         <li><img src=\"4.jpg\" alt=\"\"></li>\n");
      out.write("         <li><img src=\"5.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"7.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"8.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"1.jpg\" alt=\"\"/></li>\n");
      out.write("        <li><img src=\"2.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"3.jpg\" alt=\"\"></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("   \n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
