<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="controladores.ControladorLocal"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <jsp:include page="/recursos/comunes/tituloPaginas.jsp"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/checkout/">
        <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="/recursos/css/RegistroClienteYLocal.css" rel="stylesheet">
    </head>
    <body class="bg-light">
        <div class="container-fluid">
            <div class="row fila1"></div>
            <div class="row fila2">
                <div class="col-3 izquierda"></div>
                <div class="col-6 centro ">
                    <main>
                        <div class="col-md-7 col-lg-8">
                            <h4 class="mb-3">Registro de cliente</h4>
                            <form class="needs-validation novalidate" name="formulario1" action="../ControladorRegistroCliente?accion=insertar" method="post">
                                <div class="row g-3">
                                    <div class="col-12">
                                        <label for="username" class="form-label">Nombre de usuario</label>
                                        <div class="input-group has-validation">
                                            <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Mi nombre de usuario" required>
                                            <div class="invalid-feedback">Necesita aportar un nombre de usuario.</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label for="email" class="form-label">Email</label> 
                                    <input type="email" class="form-control" name="email" id="email" placeholder="mi.correo@mail.com" required>
                                    <div class="invalid-feedback">Por favor introduzca un email válido.</div>
                                </div>
                                <div class="col-12">
                                    <label for="password" class="form-label">Contraseña</label> 
                                    <input type="password" class="form-control" name="password" id="contraseña" placeholder="1234" required>
                                    <div class="invalid-feedback">Por favor introduzca una contraseña válida.</div>
                                </div>
                                <br>
                                <button class="w-100 btn btn-primary btn-lg" type="submit">Registrarse</button>
                            </form>
                        </div>
                    </main>
                </div>
                <div class="col-3 derecha"></div>
                <div class="row fila3"></div>
            </div>
        </div>
        <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
        <script src="recursos/form-validation.js"></script>
    </body>
    <jsp:include page="/recursos/comunes/piePagina.jsp"/>
</html>