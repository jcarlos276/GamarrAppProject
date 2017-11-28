<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>GamarrApp</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="resources/template/vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="resources/template/vendor/font-awesome/css/font-awesome.min.css">
    <!-- Custom icon font-->
    <link rel="stylesheet" href="resources/template/css/fontastic.css">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="resources/template/css/grasp_mobile_progress_circle-1.0.0.min.css">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="resources/template/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="resources/template/css/style.pink.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="resources/template/css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="resources/template/favicon.png">
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
  </head>
  <body>
    <div class="page login-page">
      <div class="container">
        <div class="form-outer text-center d-flex align-items-center">
          <div class="form-inner" style="margin:auto;">
            <div class="logo"><img src="resources/img/logo_gamarra.png" style="width:50%;"class="logo"></div>
            <p>Haz que tu cliente te ubique más rápido</p>
            <form:form id="login-form" method="post">
              <div class="form-group">
                <label for="email" class="label-custom">Usuario</label>
                <form:input path="email" id="email" type="text" name="email" required=""/>
              </div>
              <div class="form-group">
                <label for="password" class="label-custom">Contraseña</label>
                <form:input path="password" id="password" type="password" name="password" required=""/>
              </div><input id="login" type="submit" value="Login" class="btn btn-primary" /></a>
              <!-- This should be submit button but I replaced it with <a> for demo purposes-->
            </form:form>
            <font color="red">${message}</font>
			<br>
            <small>No tienes una cuenta? </small><a href="/gamarrapp/registro" class="signup">Regístrate</a>
          </div>
          <div class="copyrights text-center">
            <p>Designed for <a href="https://bootstrapious.com" class="external">Proyecto Integrador</a></p>
            <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions. Thank you for understanding :)-->
          </div>
        </div>
      </div>
    </div>
    <!-- Javascript files-->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"> </script>
    <script src="resources/template/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/template/vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="resources/template/js/grasp_mobile_progress_circle-1.0.0.min.js"></script>
    <script src="resources/template/vendor/jquery-validation/jquery.validate.min.js"></script>
    <script src="resources/template/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="resources/template/js/front.js"></script>
  </body>
</html>