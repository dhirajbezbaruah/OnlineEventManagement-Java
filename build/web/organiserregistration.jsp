<%@page import="java.sql.*" %>

<%Class.forName("com.mysql.jdbc.Driver"); %> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                 <meta charset="UTF-8">
  
  
  
      <link rel="stylesheet" href="css/registrationstyle.css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Organiser Registration</title>
    </head>
    <body onLoad="displayResults()">
        <%!
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
        %>
        <%
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
        %>
        
       
        
       
         <form action="organiserregistration.jsp" method="POST">
                <header>Organiser Registraion</header>
                <label>Username <span>*</span></label>
                <input type="text" name="uname">
                <div class="help">At least 6 character</div>
                <label>Full name <span>*</span></label>
                <input type="text" name="name">
                <label>email<span>*</span></label>
                <input type="email" name="email">
                <label>Password <span>*</span></label>
                <input type="password" name="password">
 
                <div class="help">Use upper and lowercase letter as well</div>
                <button><input type="submit" value="register" name="register" /></button>
                
                </form>
            

       
     

    </body>
</html>
