<%@page import="controladores.ControladorRegistroCliente"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="/recursos/comunes/tituloPaginas.jsp"/>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
            crossorigin="anonymous">
        <link rel="stylesheet" href="recursos/css/index.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-3 izquierda"></div>
                <div class="col-6 centro text-center">
                    <main class="form-signin w-100 mb-5 mt-5">
                        <form class="needs-validation novalidate" method="post" action="../ControladorRegistroCliente?accion=login">
                            <img class="mb-4" src="recursos/imagenes/logo.png" alt="" width="200" height="100">
                            <h1 class="h3 mb-3 fw-normal">Introduce tus datos</h1>

                            <div class="form-floating input-group has-validation">
                                <input type="email" class="form-control" name ="email" id="floatingInput"
                                       placeholder="name@example.com" required> 
                                <label for="floatingInput">Email</label>
                            </div>
                            <div class="form-floating input-group has-validation">
                                <input type="password" class="form-control" name ="password" id="floatingPassword"
                                       placeholder="Password" required>
                                <label for="floatingPassword">Contraseña</label>
                                <button id="show_password" class="btn btn-primary" type="button" onclick="mostrarPassword()"> <span class="fa fa-eye-slash icon"></span> </button>
                            </div>
                            <button class="w-100 btn btn-lg btn-primary mt-3" type="submit">Entrar</button>
                            <hr>
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-primary dropdown-toggle"
                                        data-bs-toggle="dropdown" aria-expanded="false"> 
                                    Registrarse

                                </button>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="RegistroCliente.jsp">Registrarse como cliente</a></li>
                                    <li><a class="dropdown-item" href="RegistroLocal.jsp">Registrarse como local</a></li>
                                </ul>
                            </div>
                        </form>
                    </main>
                </div>
                <div class="col-3 derecha"></div>
            </div>
        </div>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous">
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </body>
    <jsp:include page="/recursos/comunes/piePagina.jsp"/>
</html>
<script type="text/javascript">
function mostrarPassword(){
		var cambio = document.getElementById("floatingPassword");
		if(cambio.type == "password"){
			cambio.type = "text";
			$('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
		}else{
			cambio.type = "password";
			$('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
		}
	} 
	
	$(document).ready(function () {
	//CheckBox mostrar contraseña
	$('#ShowPassword').click(function () {
		$('#Password').attr('type', $(this).is(':checked') ? 'text' : 'password');
	});
});
</script>