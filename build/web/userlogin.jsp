

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>User Login</title>
  
  
  
      <link rel="stylesheet" href="css/loginstyle.css">

  
</head>

<body>

  
<form action="userloginvalidate.jsp" method="GET">
  <header>User Login</header>
  <label>Username <span>*</span></label>
  <input type="text" name="u_username">
  <div class="help">At least 6 character</div>
  <label>Password <span>*</span></label>
  <input type="password" name="u_password">
 
  <div class="help">Use upper and lowercase lettes as well</div>
  <button>Login</button>
</form>
  
  

</body>

</html>

        </form>
    </body>
</html>
