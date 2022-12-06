
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>damemimesa</title>
        <link rel="icon" type="image/png" href="recursos/logo_simple.png">
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
            crossorigin="anonymous">
        <link rel="stylesheet" href="recursos/css/index.css">
    </head>
    <body>
        <div class="container-fluid">
            <div class="row fila1">
                <!-- Enlaces momentáneos inicio -->

                <ul class="list-inline">
                    <li class="list-inline-item"><a href="vista/PerfilCliente.jsp">Perfil cliente</a></li>
                    <li class="list-inline-item"><a href="vista/PrincipalCliente.jsp">Principal cliente</a></li>
                    <li class="list-inline-item"><a href="vista/ReservaMesa.jsp">Reserva mesa </a></li>
                    <li class="list-inline-item">//</li>
                    <li class="list-inline-item"><a href="vista/PerfilLocal.jsp">Perfil local</a></li>
                    <li class="list-inline-item"> <a href="vista/PrincipalLocal.jsp">Principal local</a></li>
                    <li class="list-inline-item"><a href="vista/InfoMesa.jsp">Info mesa </a></li>
                    <li class="list-inline-item"><a href="vista/variablesImplicias.jsp?usuario=juan">Objetos implicitos con EL</a></li>
                </ul>
                <!-- Enlaces momentáneos fin -->
            </div>
            <div class="row">
                <div class="col-3 izquierda"></div>
                <div class="col-6 centro text-center">
                    <main class="form-signin w-100 mb-5 mt-5">
                        <form>
                            <img class="mb-4" src="recursos/imagenes/logo.png" alt="" width="200" height="100">
                            <h1 class="h3 mb-3 fw-normal">Introduce tus datos</h1>

                            <div class="form-floating">
                                <input type="email" class="form-control" id="floatingInput"
                                       placeholder="name@example.com"> <label
                                       for="floatingInput">Email</label>
                            </div>
                            <div class="form-floating">
                                <input type="password" class="form-control" id="floatingPassword"
                                       placeholder="Password"> <label for="floatingPassword">Contraseña</label>
                            </div>

                            <div class="checkbox mb-3">
                                <label> <input type="checkbox" value="remember-me">Recordarme
                                </label>
                            </div>
                            <button class="w-100 btn btn-lg btn-primary" type="submit">Entrar</button>
                            <hr>
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-primary dropdown-toggle"
                                        data-bs-toggle="dropdown" aria-expanded="false"> Registrarse</button>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="vista/RegistroCliente.jsp">Registrarse como cliente</a></li>
                                    <li><a class="dropdown-item" href="vista/RegistroLocal.jsp">Registrarse como local</a></li>
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
    </body>
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top fondoclaro" style="    background-color:bisque">
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
