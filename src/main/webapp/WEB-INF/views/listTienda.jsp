<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Listado de Tiendas</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Telefono</th>
                <th>Latitud</th>
                <th>Altitud</th>
                <th>Direccion</th>
                <th>Id Comerciante</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${tiendas}" var="tienda">
                <tr>
                    <td><c:out value="${tienda.id}" /></td>
                    <td><c:out value="${tienda.nombre}" /></td>
                    <td><c:out value="${tienda.telefono}" /></td>
                    <td><c:out value="${tienda.latitud}" /></td>
                    <td><c:out value="${tienda.longitud}" /></td>
                    <td><c:out value="${tienda.puesto}" /></td>
                    <td><c:out value="${tienda.idComerciante}" /></td>
                    <!-- td><a href="TiendaServlet?action=edit&id=<c:out value="${tienda.id}"/>">Update</a></td>
                    <td><a href="TiendaServlet?action=delete&id=<c:out value="${tienda.id}"/>">Delete</a></td> -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="<%=request.getContextPath()%>/login"
					class="btn btn-success"><i class="glyphicon glyphicon-edit"></i>
					Login</a>
	<br>
</body>
</html>