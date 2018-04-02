package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class organiserregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            public class organiser{
            String URL= "jdbc:mysql://127.0.0.1:330/eventproject";
            String USERNAME= "root";
            String PASSWORD= "adtu2k15";

            Connection connection= null;
            PreparedStatement insertorganiser= null;
            ResultSet resultSet= null;
            
            public organiser(){
            
            try{
                connection= DriverManager.getConnection(URL, USERNAME, PASSWORD);
                insertorganiser= connection.prepareStatement(
                "INSERT INTO organiser(o_username, o_fullname, o_email, o_password)"
                + " VALUES (?, ?, ?, ?)");

                } catch(SQLException e){
                e.printStackTrace();
                }
            }

            public int setorganiser(String uname, String name, String email, String password){
            int result= 0;
            try {
                insertorganiser.setString(1, uname);
                insertorganiser.setString(2, name);
                insertorganiser.setString(3, email);
                insertorganiser.setString(4, password);
               
                result= insertorganiser.executeUpdate();
                }catch(SQLException e){
                    e.printStackTrace();;
                }
                return result;
            }

        }
        
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

      out.write('\n');
      out.write('\n');
Class.forName("com.mysql.jdbc.Driver"); 
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("                 <meta charset=\"UTF-8\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/registrationstyle.css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Organiser Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body onLoad=\"displayResults()\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            int result=0;
            String uname= new String();
            String name= new String();
            String email= new String();
            String password= new String();
            
            if(request.getParameter("uname") != null){
                uname= request.getParameter("uname");
            }
             if(request.getParameter("name") != null){
                name= request.getParameter("name");
            }
              if(request.getParameter("email") != null){
                email= request.getParameter("email");
            }
               if(request.getParameter("password") != null){
                password= request.getParameter("password");
            }
               
               
               organiser Organiser= new organiser();
               result= Organiser.setorganiser(uname, name, email, password);
        
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("       \n");
      out.write("         <form action=\"organiserregistration.jsp\" method=\"POST\">\n");
      out.write("                <header>Organiser Registraion</header>\n");
      out.write("                <label>Username <span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"uname\">\n");
      out.write("                <div class=\"help\">At least 6 character</div>\n");
      out.write("                <label>Full name <span>*</span></label>\n");
      out.write("                <input type=\"text\" name=\"name\">\n");
      out.write("                <label>email<span>*</span></label>\n");
      out.write("                <input type=\"email\" name=\"email\">\n");
      out.write("                <label>Password <span>*</span></label>\n");
      out.write("                <input type=\"password\" name=\"password\">\n");
      out.write(" \n");
      out.write("                <div class=\"help\">Use upper and lowercase letter as well</div>\n");
      out.write("                <button><input type=\"submit\" value=\"register\" name=\"register\" /></button>\n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("            \n");
      out.write("\n");
      out.write("       \n");
      out.write("     \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
