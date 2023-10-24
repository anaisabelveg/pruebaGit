package com.softtek.models;

public class Alumno {

	private int numAlumno;
	private String nombre;
	private String apellido;
	private double nota;
	private int edad;
	private Direccion direccion;
	private boolean repetidor; 

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(int numAlumno, String nombre, String apellido, double nota, int edad, Direccion direccion, boolean repetidor) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.edad = edad;
		this.direccion = direccion;
		this.repetidor = repetidor;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public boolean isRepetidor() {
		return repetidor;
	}
	
	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	@Override
	public String toString() {
		return "Alumno [numAlumno=" + numAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota
				 + ", edad=" + edad + ", direccion=" + direccion + ", repetidor=" + repetidor
				+ "]";
	}
	
	

}
