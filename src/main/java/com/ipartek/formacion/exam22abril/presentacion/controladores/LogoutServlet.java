package com.ipartek.formacion.exam22abril.presentacion.controladores;

import java.io.IOException;

import com.ipartek.formacion.exam22abril.entidades.MensajeUsuario;

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
		
		MensajeUsuario mensajeExito = new MensajeUsuario("La operación de logout se realizó correctamente.", MensajeUsuario.INFORMATIVO);
		request.getSession().setAttribute("mensajeExito", mensajeExito.getMensaje());
		request.getSession().setAttribute("tiempoEspera", 2000);

		response.sendRedirect(request.getContextPath() + "/index");
	}
}
