package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	
	private String nombre;
	private List<String> cursos = new ArrayList<>();

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addCurso(String curso) {
		cursos.add(curso);
	}
	
	public void remove(String curso) {
		cursos.remove(curso);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getCursos() {
		return cursos;
	}

}
