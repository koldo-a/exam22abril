package com.ipartek.formacion.exam22abril.presentacion.controladores;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		
		request.getSession().setAttribute("mensajeExito", "La operación de logout se realizó correctamente.");
		request.getSession().setAttribute("tiempoEspera", 2000);

		System.out.println("Mensaje de éxito establecido correctamente: " + request.getSession().getAttribute("mensajeExito"));

		response.sendRedirect(request.getContextPath() + "/index");

		System.out.println("Redirección realizada correctamente");
	}
}
