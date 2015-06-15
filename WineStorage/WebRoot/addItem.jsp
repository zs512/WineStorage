<%--
  Created by IntelliJ IDEA.
  User: ruanqx
  Date: 2015/6/15
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
  <link rel="shortcut icon" href="img/favicon.png">

  <title>Login Page 2 | Creative - Bootstrap 3 Responsive Admin Template</title>

  <!-- Bootstrap CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- bootstrap theme -->
  <link href="css/bootstrap-theme.css" rel="stylesheet">
  <!--external css-->
  <!-- font icon -->
  <link href="css/elegant-icons-style.css" rel="stylesheet" />
  <link href="css/font-awesome.css" rel="stylesheet" />
  <!-- Custom styles -->
  <link href="css/style.css" rel="stylesheet">
  <link href="css/style-responsive.css" rel="stylesheet" />
  <link href="css/font-chinese.css" rel="stylesheet"/>

  <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <![endif]-->
</head>

<body class="login-img3-body">

<div class="container">

  <form class="login-form" action="<%=request.getContextPath()%>/login.action" method="post">
    <div class="login-wrap">
      <p class="login-img"><i class="icon_lock_alt"></i></p>
      <div class="input-group">
        <span class="input-group-addon"><i class="icon_profile"></i></span>
        <input type="text" class="form-control" placeholder="username" autofocus name="name">
      </div>
      <div class="input-group">
        <span class="input-group-addon"><i class="icon_key_alt"></i></span>
        <input type="password" class="form-control" placeholder="password" name="password">
      </div>
      <!--
      <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
          <span class="pull-right"> <a href="#"> Forgot Password?</a></span>
      </label>
      -->
      <button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
      <!--
      <button class="btn btn-info btn-lg btn-block" type="submit">Sign up</button>
      -->
    </div>
  </form>

</div>


</body>
</html>
