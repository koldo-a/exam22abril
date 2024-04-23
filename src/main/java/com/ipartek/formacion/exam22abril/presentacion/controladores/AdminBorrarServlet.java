package com.ipartek.formacion.exam22abril.presentacion.controladores;

import java.io.IOException;

import com.ipartek.formacion.exam22abril.configuraciones.Globales;
import com.ipartek.formacion.exam22abril.entidades.MensajeUsuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin/borrar")
public class AdminBorrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sId=request.getParameter("id");
		Long id = Long.valueOf(sId);
		Globales.DAO_LIBRO.borrar(id);
		
		
		MensajeUsuario mensajeExito = new MensajeUsuario("La operación de borrado se realizó correctamente.", MensajeUsuario.INFORMATIVO);
		request.getSession().setAttribute("mensajeExito", mensajeExito.getMensaje());
		request.getSession().setAttribute("tiempoEspera", 2000);

		response.sendRedirect(request.getContextPath() + "/admin/libros");
	}
}
