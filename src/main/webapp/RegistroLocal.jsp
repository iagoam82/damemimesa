<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registro de local</title>
<link rel="icon" type="image/png" href="recursos/logo_simple.png">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.2/examples/checkout/">
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
						<h4 class="mb-3">Registro de local</h4>
						<form class="needs-validation novalidate" name="formulario2" action="../ControladorLocal?accion=insertar" method="post">
							<div class="row g-3">
								<div class="col-12">
									<label for="username" class="form-label">Nombre de usuario</label>
									<div class="input-group has-validation">
										<input type="text" class="form-control" name="nombreLocal" id="username"
											placeholder="Mi nombre de usuario" required>
										<div class="invalid-feedback">Necesita aportar un nombre de usuario.</div>
									</div>
								</div>
							</div>
							<div class="col-12">
								<label for="Address" class="form-label">Dirección</label>
								<input type="text" class="form-control" name="direccionLocal" id="adress"
									placeholder="C/ de la hostelería, 37" required>
								<div class="invalid-feedback">Por favor introduzca una dirección válida.</div>
							</div>
							<div class="col-12">
								<label for="Phone" class="form-label">Teléfono</label>
								<input type="text" class="form-control" name="telefonoLocal" id="phone"
									placeholder="600123456" required>
								<div class="invalid-feedback">Por favor introduzca un teléfono válido.</div>
							</div>
							<div class="col-12">
								<label for="email" class="form-label">Email</label>
								<input type="email" class="form-control" name="emailLocal" id="email"
									placeholder="mi.correo@mail.com" required>
								<div class="invalid-feedback">Por favor introduzca un email válido.</div>
							</div>
							<div class="col-12">
								<label for="password" class="form-label">Contraseña</label>
								<input type="password" class="form-control" name="passwordLocal" id="password"
									placeholder="1234" required>
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
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top fondoclaro">
    <p class="col-md-4 mb-0 text-muted">&copy; 2022 damemimesa</p>

   <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
                  <img src="/recursos/imagenes/logo.png" class="img-fluid" alt="logo damemimesa" style="width:140px;height:65px;">
                </a>

    <ul class="nav col-md-4 justify-content-end">
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Contacto</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Sobre nosotros</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">nada</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">nada</a></li>
    </ul>
  </footer>
    
    
	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
	<script src="recursos/form-validation.js"></script>
</body>
</html>