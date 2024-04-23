<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<main class="container">
	<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 row-cols-xl-5 row-cols-xxl-6 g-4">
		<c:forEach items="${libros}" var="p">
			<div class="col">
				<div class="card h-100">
					<img src="${p.urlFoto}" class="card-img-top" alt="...">
					<div class="card-body">
						<h6 class="card-title">${p.nombre}</h6>
						<h7 class="card-text">${p.autor}</h7>
						<div class="precio">
							<p class="precio1">
								<fmt:formatNumber type="currency" value="${p.precio -(p.descuento /100* p.precio)}" />
							</p>
							<p class="precio2">
								<fmt:formatNumber type="currency" value="${p.precio}" />
							<div class="descuento">
								<p class="descuento2">-<fmt:formatNumber type="number" value="${p.descuento}"/>%</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</main>
<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>