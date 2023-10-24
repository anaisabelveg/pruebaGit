package com.softtek.models;

public class Alumno {

	private int numAlumno;
	private String nombre;
	private double nota;
	private Direccion direccion;

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(int numAlumno, String nombre, double nota, Direccion direccion) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.nota = nota;
		this.direccion = direccion;
	}

	public int getNumAlumno() {
		return numAlumno;
	}

	public void setNumAlumno(int numAlumno) {
		this.numAlumno = numAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Alumno [numAlumno=" + numAlumno + ", nombre=" + nombre + ", nota=" + nota + ", direccion=" + direccion
				+ "]";
	}

}
