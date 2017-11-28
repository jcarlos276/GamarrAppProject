<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
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
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="resources/template/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="resources/template/css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="resources/template/css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="favicon.png">
  </head>
  <body>
    <!-- Side Navbar -->
    <nav class="side-navbar">
        <div class="side-navbar-wrapper">
          <div class="sidenav-header d-flex align-items-center justify-content-center">
            <div class="sidenav-header-inner text-center"><img src="img/avatar-1.jpg" alt="person" class="img-fluid rounded-circle">
              <h2 class="h5 text-uppercase">NOMBRE</h2><span class="text-uppercase">Comerciante</span>
            </div>
            <div class="sidenav-header-logo"><a href="index.html" class="brand-small text-center"> <strong class="text-primary">G</strong><strong>A</strong></a></div>
          </div>
          <div class="admin-menu">
            <ul id="side-admin-menu" class="side-menu list-unstyled"> 
              <!--ACA REF DE MI TIENDA-->
             <li> <a href="#pages-nav-list" data-toggle="collapse" aria-expanded="false"><i class="icon-home"></i><span>Mi tienda</span>
                <div class="arrow pull-right"><i class="fa fa-angle-down"></i></div></a>
              <ul id="pages-nav-list" class="collapse list-unstyled">
              	<li class="active"> <a href="/gamarrapp/mi-tienda">Gestionar</a></li>
                <li> <a href="#">Ofertas</a></li>
                <li> <a href="#">Crear oferta</a></li>
              </ul>
            </li>
            </ul>
          </div>
          <div class="main-menu">
            <ul id="side-main-menu" class="side-menu list-unstyled">        
              <!--ACA REF DE TIENDAS-->      
              <li><a href="<%=request.getContextPath()%>/"><i class="icon-list"></i><span>Tiendas</span></a></li>
              <!--ACA REF DE MAPAS-->
              <li> <a href="#"> <i class="icon-line-chart"> </i><span>Mapa</span></a></li>
            </ul>
          </div>
        </div>
    </nav>
    <div class="page home-page">
      <!-- navbar-->
      <header class="header">
        <nav class="navbar">
          <div class="container-fluid">
            <div class="navbar-holder d-flex align-items-center justify-content-between">
              <div class="navbar-header"><a id="toggle-btn" href="#" class="menu-btn"><i class="icon-bars"> </i></a><a href="index.html" class="navbar-brand">
                  <div class="brand-text d-none d-md-inline-block"><strong class="text-primary">Gamarr</strong><span>App</span></div></a></div>
              <ul class="nav-menu list-unstyled d-flex flex-md-row align-items-md-center">
                <li class="nav-item"><a href="login.html" class="nav-link logout">Cerrar Sesión<i class="fa fa-sign-out"></i></a></li>
              </ul>
            </div>
          </div>
        </nav>
      </header>
      
      <!-- Counts Section -->
      <section class="dashboard-counts section-padding">
        <div class="container-fluid">
          <div class="row">
            <div class="col-xl-6 col-md-8 col-12">
              <div class="wrapper count-title d-flex">
                <div class="icon"><i class="icon-padnote"></i></div>
                <div class="name"><strong class="text-uppercase">Ofertas</strong>
                  <div class="count-number">92</div>
                </div>
              </div>
            </div>
            <div class="col-xl-6 col-md-8 col-12">
              <div class="wrapper count-title d-flex">
                <div class="icon"><i class="icon-interface-windows"></i></div>
                <div class="name"><strong class="text-uppercase">Categorías</strong><span>Last 7 days</span>
                  <div class="count-number">70</div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!-- Header Section-->
      <section class="dashboard-header section-padding">
        <div class="container-fluid">
          <div class="row d-flex align-items-md-stretch">
            <!-- To Do List-->
            <div class="col-lg-3 col-md-6">
              <div class="wrapper to-do">
                <header>
                  <h2 class="display h4">Nombre</h2>
                  <p>NOMBRE DE LA TIENDA</p>
                </header>
              </div>
            </div>
            <!-- Pie Chart-->
            <div class="col-lg-3 col-md-6">
              <div class="wrapper project-progress">
                <h2 class="display h4">Detalles</h2>
                <ul style="margin:40px 15px">
                    <h5>Telefono</h5><p>987223414</p>
                    <h5>Ubicación</h5><p>Av. Pruebas</p>
                    <h5>Puesto</h5><p>Av. Pruebas</p>
                </ul>
              </div>
            </div>
            <!-- Line Chart -->
            <div class="col-lg-6 col-md-12 flex-lg-last flex-md-first align-self-baseline">
              <div class="wrapper sales-report">
                <h2 class="display h4">Categorías</h2>
                <ul style="margin:40px 15px">
                    <p> CATEGORIA 1 </p>                    
                </ul>
              </div>
            </div>
          </div>
        </div>
      </section>
      
      <footer class="main-footer">
          <div class="container-fluid">
            <div class="row">
              <div class="col-sm-6">
                <p>GamarrApp &copy; 2017</p>
              </div>
              <div class="col-sm-6 text-right">
                <p>Designed for <a href="https://bootstrapious.com" class="external">Proyecto Integrador</a></p>
                <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions. Thank you for understanding :)-->
              </div>
            </div>
          </div>
        </footer>
      </div>
      <!-- Javascript files-->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <!--Dropdown-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"> </script>
    <script src="resources/template/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/template/vendor/jquery-validation/jquery.validate.min.js"></script>
    <script src="resources/template/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    
    <script src="resources/template/js/front.js"></script>
    </body>
  </html>