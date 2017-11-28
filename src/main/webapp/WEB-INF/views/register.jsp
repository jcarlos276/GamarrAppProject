<html>
<head>
	<title>Index</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=devide-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap-grid.min.css">
    <link rel="stylesheet" type="text/css" href="resources/css/login.css">
</head>
<body class="container">
	<!--img src="resources/img/logo_gamarra.png" class="logo"-->
	<div class="jumbotron boxlogin">
		<form action="RegisterServlet" method="post" name="formlog" id="formlog">
			<label for="user">Nombre Completo:</label>
			<input type="text" name="fullname" class="form-control">
			<label for="user">DNI:</label>
			<input type="text" name="dni" class="form-control">
			<label for="user">Correo:</label>
			<input type="text" name="uname" class="form-control">
			<label for="password">Contraseña:</label>
			<input type="password" name="pass" class="form-control">
			<input type="submit" value="Registrarse" class="btn btn-success btn-block">
		</form>
		<a href="<%=request.getContextPath()%>/login">Ya tienes una cuenta? Ingresa</a>
	</div>
	<footer class="footer">
		<div class="container">
		<span>©2017 GAMARRApp All rights reserved</span>
		</div>
	</footer>
</body>
</html>
