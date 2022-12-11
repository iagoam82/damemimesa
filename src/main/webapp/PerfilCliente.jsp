<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controladores.ControladorRegistroCliente"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="/recursos/comunes/tituloPaginas.jsp"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link href="/recursos/css/perfiles.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="/recursos/comunes/navegadorCliente.jsp"/>
        <div class="container">
            <div class="row">
                <div class="col-3"></div>
                <div class="col-6">
                    <main>
                        <div class="col-md-7 col-lg-8 ">
                            <h4 class="mb-3">Mi perfil</h4>
                            <form class="needs-validation novalidate" name="formulario2">
                                <div class="row g-3">
                                    <div class="col-12">
                                        <label for="username" class="form-label" >Nombre de usuario</label>
                                        <div class="input-group has-validation">
                                            <input type="text" class="form-control" name="nombre" id="nombre" value="${cliente.nombreCliente}">
                                            <div class="invalid-feedback">Necesita aportar un nombre de usuario.</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label for="email" class="form-label" aria-label="Disabled input example" >Email (No se puede cambiar)</label> 
                                    <input type="email" class="form-control" name="email" id="email" value="${cliente.emailCliente}" >
                                    <div class="invalid-feedback">Por favor introduzca un email válido.</div>
                                </div>
                                <br>
                                <button class="w-100 btn btn-primary btn-lg" type="submit">
                                    <a style="color:white;text-decoration: none;"
                                       href="${pageContext.request.contextPath}/ControladorRegistroCliente?accion=actualizar">
                                        Guardar cambios
                                    </a>
                                </button>
                                <hr>
                                <button class="w-100 btn btn-primary btn-lg btn-danger" type="submit" >
                                    <a style="color:white;text-decoration: none;"
                                       href="${pageContext.request.contextPath}/ControladorRegistroCliente?accion=eliminar&email_cliente=${email}">
                                        Eliminar perfil
                                    </a>
                                </button>
                            </form>
                        </div>
                    </main>
                </div>
                <div class="col-3"></div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
    <jsp:include page="/recursos/comunes/piePagina.jsp"/>
</html>




