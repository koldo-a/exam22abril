package com.ipartek.formacion.exam22abril.presentacion.controladores;

import java.io.IOException;

import com.ipartek.formacion.exam22abril.entidades.MensajeUsuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if("administrador".equals(email) && "123456".equals(password)) {
			request.getSession().setAttribute("usuario", email);
//			request.getSession().setAttribute("mensajeExito", "La operación de login se realizó correctamente.");
//			request.getSession().setAttribute("tiempoEspera", 2000);
//
//			System.out.println("Mensaje de éxito establecido correctamente: " + request.getSession().getAttribute("mensajeExito"));
//
//			response.sendRedirect(request.getContextPath() + "/admin/libros");
//
//			System.out.println("Redirección realizada correctamente");
            // Crear mensaje de éxito y establecerlo en la sesión
            MensajeUsuario mensaje = new MensajeUsuario("La operación de login se realizó correctamente.", 2000);
            request.getSession().setAttribute("mensaje", mensaje);

            response.sendRedirect(request.getContextPath() + "/admin/libros");
			
			return;
		}
		
		request.setAttribute("error", "El usuario o contraseña son incorrectos");
		request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
	}
}
