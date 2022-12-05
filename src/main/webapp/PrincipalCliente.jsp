<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="modelo.Local" %>
<%@page import="controladores.ControladorLocal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal cliente</title>
        <link rel="icon" type="image/png" href="recursos/logo_simple.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link href="/recursos/css/principalCliente.css" rel="stylesheet">
    </head>
    <body>
        <header class="p-3 mb-3 border-bottom fondoclaro">
            <div class="container">
              <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
                                    <img src="/recursos/imagenes/logo.png" class="img-fluid" alt="logo damemimesa" style="width:140px;height:65px;">

                </a>
                <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                  <li><a href="#" class="nav-link px-2 link-secondary">Búsqueda</a></li>
                  <li><a href="vista/ListaRestaurantes.jsp" class="nav-link px-2 link-dark" action="../ControladorLocal?accion=listar">Restaurantes</a></li>
                  <li><a href="#" class="nav-link px-2 link-dark">Mis reservas</a></li>
                </ul>
                <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                  <input type="search" class="form-control" placeholder="Buscar..." aria-label="Search">
                </form>
                <div class="dropdown text-end">
                  <a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                    <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                        <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                        <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
                    </svg>
                  </a>
                  <ul class="dropdown-menu text-small">
                    <li><a class="dropdown-item" href="#">Mi perfil</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="#">Cerrar sesión</a></li>
                  </ul>
                </div>
              </div>
            </div>
        </header>
            <div class="container">
                <div class="row">
                    <div class="col-2 filtros m-1">
                        <p class="display-5" style="text-align:center">Filtros</p>
                        <hr size="">
                            <div class="row distancia ">
                                <p class="menosTamaño">Distancia</p>
                                <input type="range" class="form-range separado" min="0" max="30" step="1" id="customRange3">
                            </div>
                            <div class="row estancia ">
                                <p class="menosTamaño">Tipo estancia</p>
                                <div class="form-check form-switch ">
                                    <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheck1">
                                    <label class="form-check-label" for="flexSwitchCheckDefault">Interior</label>
                                  </div>
                                  <div class="form-check form-switch">
                                    <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheck2" >
                                    <label class="form-check-label" for="flexSwitchCheckChecked">Terraza</label>
                                  </div>
                                  <div class="form-check form-switch">
                                    <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheck3" >
                                    <label class="form-check-label separado" for="flexSwitchCheckDisabled">Reservado</label>
                                </div>
                            </div>
                            <div class="row comensales ">
                                <p class="menosTamaño">Nº comensales</p>
                                <select class="form-select form-select-sm  separado" aria-label=".form-select-lg example">
                                    <option selected>Seleccione</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                </select>
                            </div>
                            <div class="row encontrados">
                               <label class="" for="encontrados">X Restaurantes encontrados</label>
                            </div>
                    </div>
                    <div class="col-9 resultados" >
                        <div class="row">
                            <!--AQUÍ SALE LA LISTA DE RESTAURANTES FILTRADOS-->
                            <c:forEach var="local" items="${locales}">
                                <div class="card m-1" style="width: 17rem;text-align:center;">
                                    <div class="card-body">
                                        <h5 class="card-title">Nombre: ${local.nombreLocal}  </h5>
                                      <p class="card-text">Dirección: ${local.nombre} </p>
                                      <p class="card-text">Email: ${local.nombre_local} </p>
                                      <p class="card-text">Teléfono: ${local.telefonoLocal} </p>
                                      <a href="#" class="card-link">Ver en google</a>
                                      <a href="#" class="card-link">Reserva</a>
                                    </div>
                                </div>
                            </c:forEach>                                                                                                                                   
                        </div>   
                    </div>
                </div>
            </div>
           
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
      <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top fondoclaro">
    <p class="col-md-4 mb-0 text-muted">&copy; 2022 damemimesa</p>

    <a href="/index.html" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
                  <img src="/recursos/imagenes/logo.png" class="img-fluid" alt="logo damemimesa" style="width:140px;height:65px;">
                </a>

    <ul class="nav col-md-4 justify-content-end">
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Contacto</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Sobre nosotros</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">nada</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">nada</a></li>
    </ul>
  </footer>
    
</html>
