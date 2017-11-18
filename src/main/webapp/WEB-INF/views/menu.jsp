<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="resources/css/menu.css">
        <script type="text/javascript" src="resources/js/function.js"></script>
        <link rel="stylesheet" href="resources/css/bootstrap-menu.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-trans navbar-fixed-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapsible">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#"><img alt="logo" src="resources/img/logo_gamarra.png" width=60px" height="50px"></a>
            </div>
            <div class="navbar-collapse collapse" id="navbar-collapsible">
              <ul class="nav navbar-nav navbar-left">
                <li><a href="#section1">Tiendas</a></li>
                <li><a href="#section2">Favoritos</a></li>
                <li>&nbsp;</li>
              </ul>
              <form class="navbar-form" action="LogoutServlet" method="post">
                <div class="form-group" style="display:inline;">
                  <div class="input-group"> 
                    <div class="input-group-btn">
                      <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-chevron-down"></span></button>
                      <ul class="dropdown-menu">
                        <li><a href="#">Ropa para damas</a></li>
                        <li><a href="#">Ropa para caballeros</a></li>
                        <li><a href="#">Ropa para niños</a></li>
                        <li><a href="#">Ropa para bebes</a></li>
                        <li><a href="#">Uniformes para empresas</a></li>
                        <li><a href="#">Ropa industrial</a></li>
                        <li><a href="#">Ropa publicitaria</a></li>
                        <li><a href="#">Confeccion</a></li>
                        <li><a href="#">Estampado</a></li>
                        <li><a href="#">Bordado</a></li>
                        <li><a href="#">Sublimado</a></li>
                        <li><a href="#">Moldes y patronaje</a></li>
                        <li><a href="#">Telas</a></li>
                        <li><a href="#">Insumo</a></li> 
                      </ul>
                    </div>
                    <input type="text" class="form-control" placeholder="What are searching for?">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span> </span>
                  </div>
                  <div class="nav navbar-nav navbar-right">
	                <%
						if(session.getAttribute("username")==null){
							response.sendRedirect("index.jsp");
						}
					%>
					Hello! ${username}
	                  <input type="submit" value="Logout" class="btn btn-danger">
                  </div>
                </div>
              </form>
              <!--
				<div class="nav navbar-nav navbar-right">
				<%
					if(session.getAttribute("username")==null){
						response.sendRedirect("index.jsp");
					}
				%>
				Hello! ${username}
					<form action="LogoutServlet" method="post">
						<input type="submit" value="Logout">
					</form>
				</div>
			 -->
            </div>
          </div>
        </nav>
        
        <section class="container-fluid" id="section1">
              <h2 class="text-center v-center">Tiendas</h2>
              <div class="list-group" style="margin:50px;">
				  <a href="#" class="list-group-item">Tienda 1</a>
				  <a href="#" class="list-group-item">Tienda 2</a>
				  <a href="#" class="list-group-item">Tienda 3</a>
				  <a href="#" class="list-group-item">Tienda 4</a>
				  <a href="#" class="list-group-item">Tienda 5</a>
				</div>
        </section>
        
        <section class="container-fluid" id="section2">
            <h2 class="text-center">Favoritos</h2>
        </section>
        
		<footer id="footer">
          <div class="container">
            <div class="row">    
              <div class="col-xs-8 col-sm-6 col-md-4 column">          
                  <h4>Informacion</h4>
                  <ul class="nav">
                    <li><a href="#">Auspiciadores</a></li>
                    <li><a href="#">Servicios</a></li>
                    <li><a href="#">Desarrolladores</a></li>
                  </ul> 
                </div>
              <div class="col-xs-8 col-md-4 column">          
                  <h4>Contactanos</h4>
                  <ul class="nav">
                    <li><a href="#">Correo</a></li>
                    <li><a href="#">Facebook</a></li>
                    <li><a href="#">Soporte</a></li>
                  </ul> 
              </div>
              <div class="col-xs-8 col-md-4 column">          
                  <h4>Servicio al Cliente</h4>
                  <ul class="nav">
                    <li><a href="#">Nosotros</a></li>
                    <li><a href="#">Politicas de Privacidad</a></li>
                    <li><a href="#">Terminos &amp; Condiciones</a></li>
                  </ul> 
              </div>
            </div><!--/row-->
          </div>
        </footer>
        </body>
        
</html>