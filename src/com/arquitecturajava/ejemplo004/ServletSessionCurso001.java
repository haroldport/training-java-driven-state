package com.arquitecturajava.ejemplo004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletSessionCurso001")
public class ServletSessionCurso001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Persona persona = (Persona) session.getAttribute("persona");
		if(request.getParameter("cursoNombre") != null) persona.addCurso(request.getParameter("cursoNombre"));
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		if(persona != null) {			
			for(String c: persona.getCursos()) {			
				pw.println("<p>" + c + "</p>");
			}
		} else {
			pw.println("La sesion esta vacia");
		}
		pw.println("<a href='formularioCurso.html'>volver al Formulario Curso</a>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
