package com.softtek;

import com.softtek.models.Alumno;
import com.softtek.models.Direccion;

public class AppMain {

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos al curso de GIT");
		
		Alumno alumno = new Alumno(1, "Pepito","Perez", 6.3, 25, new Direccion("Mayor", 5, "Madrid"), false);
		System.out.println(alumno);

	}

}
