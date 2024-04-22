<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<main class="container">
	<%
	if (session.getAttribute("mensajeExito") != null) {
	%>
	<div class="alert alert-success" role="alert">
		<%=session.getAttribute("mensajeExito")%>
	</div>
	<%
	}
	%>
	
	<form novalidate action="admin/libro" method="post">
		<div class="row mb-3">
			<label for="id" class="col-sm-2 col-form-label">Id</label>
			<div class="col-sm">
				<input type="number" readonly class="form-control" id="id" name="id"
					value="${libro.id}">
			</div>
		</div>
		<div class="row mb-3">
			<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
			<div class="col-sm">
				<input type="text"
					class="form-control ${errores.nombre != null ? 'is-invalid' : '' }"
					id="nombre" name="nombre" value="${libro.nombre}">
				<div class="invalid-feedback">${errores.nombre}</div>
			</div>
		</div>
		<div class="row mb-3">
			<label for="urlFoto" class="col-sm-2 col-form-label">URL Foto</label>
			<div class="col-sm">
				<input type="text"
					class="form-control ${errores.urlFoto != null ? 'is-invalid' : '' }"
					id="urlFoto" name="urlFoto" value="${libro.urlFoto}">
				<div class="invalid-feedback">${errores.urlFoto}</div>
			</div>
		</div>
		<div class="row mb-3">
			<label for="autor" class="col-sm-2 col-form-label">Autor</label>
			<div class="col-sm">
				<input type="text"
					class="form-control ${errores.autor != null ? 'is-invalid' : '' }"
					id="autor" name="autor" value="${libro.autor}">
				<div class="invalid-feedback">${errores.autor}</div>
			</div>
		</div>
		<div class="row mb-3">
			<label for="precio" class="col-sm-2 col-form-label">Precio</label>
			<div class="col-sm">
				<div class="input-group mb-3">
					<input type="number" step=".01"
						class="form-control ${errores.precio != null ? 'is-invalid' : '' }"
						id="precio" name="precio" value="${libro.precio}"> <span
						class="input-group-text">€</span>
					<div class="invalid-feedback">${errores.precio}</div>
				</div>
			</div>
		</div>
		<div class="row mb-3">
			<label for="descuento" class="col-sm-2 col-form-label">Descuento</label>
			<div class="col-sm">
				<div class="input-group mb-3">
					<input type="number" step=".01"
						class="form-control ${errores.descuento != null ? 'is-invalid' : '' }"
						id="descuento" name="descuento" value="${libro.descuento}">
					<div class="invalid-feedback">${errores.descuento}</div>
				</div>
			</div>
		</div>

		<div class="row mb-3">
			<div class="offset-sm-2 col-sm">
				<button class="btn btn-primary">Guardar</button>
			</div>
		</div>

	</form>
</main>
<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>