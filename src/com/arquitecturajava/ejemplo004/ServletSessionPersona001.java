package com.arquitecturajava.ejemplo004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletSessionPersona001")
public class ServletSessionPersona001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String nombre = request.getParameter("nombre");
		Persona p = new Persona(nombre);
		session.setAttribute("persona", p);
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("Persona registrada: " + p.getNombre());
		pw.println("<a href='formularioCurso.html'>Formulario Curso</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
