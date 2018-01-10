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
      <h1>Register to WarNet</h1>
      <form method="post">
      <div class="reg_section personal_info">
      Clan name: <input type="text" name="clanname" value="${clanname}">
      Minimum rank: <input type="text" name="minrank" value="${minrank}">
      Maximum members: <input type="number" name="maxmem" value="${maxmem}">
      </div>
      <p class="submit"><input type="submit" value="Update"></p>
      </form>
      <p class="submit"><a href="/clan/${id}/deleted"><input type="submit" value="Delete"></a></p>
    </section>
  </div>
</body>
</html>