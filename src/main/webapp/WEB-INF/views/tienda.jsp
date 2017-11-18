<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link type="text/css"
    href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Add new user</title>
</head>
<body>

    <form method="POST" action='TiendaServlet' name="frmAddTienda">
        ID : <input type="text" readonly="readonly" name="id"
            value="<c:out value="${tienda.id}" />" /> <br /> 
        Nombre : <input
            type="text" name="nombre"
            value="<c:out value="${tienda.nombre}" />" /> <br /> 
        Latitud : <input
            type="text" name="latitud"
            value="<c:out value="${tienda.latitud}" />" /> <br />
        Altitud : <input
            type="text" name="altitud"
            value="<c:out value="${tienda.altitud}" />" /> <br />
        Direccion : <input
            type="text" name="direccion"
            value="<c:out value="${tienda.direccion}" />" /> <br /> 
        Telefono : <input
            type="text" name="telefono"
            value="<c:out value="${tienda.telefono}" />" /> <br />
        Comerciante : <input type="text" name="idComerciante"
            value="<c:out value="${tienda.idComerciante}" />" /> <br /> 
            <input type="submit" value="Submit" />
    </form>
</body>
</html>