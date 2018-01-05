<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>WarNet</title>
  <link rel="stylesheet" href="css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="register">
      <h1>Register to WarNet</h1>
      <form method="post">
      <div class="reg_section personal_info">
      Username: <input type="text" name="username" value="" placeholder="username">
      Password: <input type="password" name="password" value="" placeholder="password">
      Email: <input type="text" name="email" value="" placeholder="email">
      Game ID: <input type="text" name="gameid" value="" placeholder="game id ">
      </div>
      <p class="terms">
        <label>
          <input type="checkbox" name="remember_me" id="remember_me">
           I am not a robot
        </label>
      </p>
      <p class="submit"><input type="submit" value="Register"></p>
      </form>
    </section>
  </div>
</body>
</html>