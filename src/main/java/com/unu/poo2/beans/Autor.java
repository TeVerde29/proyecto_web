package com.unu.poo2.beans;

public class Autor {
	
	private int idAutor;
	private String nacionalidad;
	private String nombre;
	
	public Autor(int idAutor, String nacionalidad, String nombre) {
		super();
		this.idAutor = idAutor;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
	}

	public Autor() {
		this(0, "", "");
	}
	
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionaliadad) {
		this.nacionalidad = nacionaliadad;
	}
	public String getNombreAutor() {
		return nombre;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombre = nombreAutor;
	}
}