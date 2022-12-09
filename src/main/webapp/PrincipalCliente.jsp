<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<%@page import="modelo.Local" %>
<%@page import="controladores.ControladorLocal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="/recursos/comunes/tituloPaginas.jsp"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link href="/recursos/css/principalCliente.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="/recursos/comunes/navegadorCliente.jsp"/>
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
                        </div>   
                    </div>
                </div>
            </div>
           
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
      <jsp:include page="/recursos/comunes/piePagina.jsp"/>
    
</html>
