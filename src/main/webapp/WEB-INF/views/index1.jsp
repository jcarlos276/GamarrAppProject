<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Index</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=devide-width, initial-scale=1.0">
    <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body class="container">
	<img src="resources/img/logo_gamarra.png" class="logo">
	<div class="jumbotron boxlogin">		
		<form:form method="post" action="login" id="formlog">
					<div class="form-group">
						<label for="email">Login: </label>
						<form:input path="email" class="form-control" />
					</div>
					<div class="form-group">
						<label for="password">Password: </label>
						<form:input path="password" class="form-control" />
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn btn-success btn-block" />
					</div>
				</form:form>
				<font color="red">${message}</font>
				<br>
				<a href="<%=request.getContextPath()%>/register">No estas registrado? Registrate</a>
	</div>
	<footer class="footer">
		<div class="container">
		<span>©2017 GAMARRApp All rights reserved</span>
		</div>
	</footer>
</body>
</html>
