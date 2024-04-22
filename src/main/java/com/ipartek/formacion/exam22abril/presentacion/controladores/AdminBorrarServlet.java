package com.ipartek.formacion.exam22abril.presentacion.controladores;

import java.io.IOException;

import com.ipartek.formacion.exam22abril.configuraciones.Globales;

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
		
		
		request.getSession().setAttribute("mensajeExito", "La operación de borrado se realizó correctamente.");
		request.getSession().setAttribute("tiempoEspera", 2000);

		System.out.println("Mensaje de éxito establecido correctamente: " + request.getSession().getAttribute("mensajeExito"));

		response.sendRedirect(request.getContextPath() + "/admin/libros");

		System.out.println("Redirección realizada correctamente");
	}
}
