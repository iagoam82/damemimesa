<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<%@page import="modelo.Local" %>
<%@page import="controladores.ControladorLocal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach  items="${locales}" var="local">
                                <div class="card m-1" style="width: 17rem;text-align:center;">
                                    <div class="card-body">
                                       
                                        <h5 class="card-title">Nombre:${local.nombreLocal} </h5>
                                      <p class="card-text">Dirección: ${local.direccionLocal} </p>
                                      <p class="card-text">Email: ${local.emailLocal} </p>
                                      <p class="card-text">Teléfono: ${local.telefonoLocal} </p>
                                      <a href="#" class="card-link">Ver en google</a>
                                      <a href="#" class="card-link">Reserva</a>
                                    </div>
                                </div>
                            </c:forEach>      
    </body>
</html>
