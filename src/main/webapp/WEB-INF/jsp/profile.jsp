<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>WarNet Database</title>
  <link rel="stylesheet" href="css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="register">
      <h1>Profile</h1>
      <form method="post">
      <div class="reg_section personal_info">
      Username: <input type="text" name="username" value=${username}>
      Password: <input type="text" name="password" value=${password}>
      Email: <input type="text" name="email" value=${email}>
      Game ID: <input type="text" name="gameid" value=${gameid}>
      </div>
      <p class="submit"><input type="submit" value="Update"></p>
      </form>
      <p class="submit"><a href="/playerdata/${id}/deleted"><input type="submit" value="Delete"></a></p>
      <p class="submit"><a href="/clan"><input type="submit" value="Manage clan"></a></p>
    </section>
  </div>
</body>
</html>