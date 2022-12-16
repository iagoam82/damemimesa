<%@ page isELIgnored="false"%>
<header class="p-3 mb-3 border-bottom" style="background-color:bisque">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
                <img src="/recursos/imagenes/logo.png" class="img-fluid" alt="logo damemimesa" style="width:140px;height:65px;">
            </a>
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="/PrincipalCliente.jsp" class="nav-link px-2 link-dark">Búsqueda</a></li>
                <li><a href="${pageContext.request.contextPath}/ControladorLocal?accion=listar" class="nav-link px-2 link-dark">Restaurantes</a></li>
                <li><a href="#" class="nav-link px-2 link-dark">Mis reservas</a></li>
            </ul>
            <p class="h5 m-2">${cliente.nombreCliente}</p>
            <div class="dropdown text-end">
                <a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                    <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                        <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                        <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
                    </svg>
                </a>
                <ul class="dropdown-menu text-small">
                    <li><a class="dropdown-item" href="PerfilCliente.jsp">Mi perfil</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="/">Cerrar sesión</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>