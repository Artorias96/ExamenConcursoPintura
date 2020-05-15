package com.svalero.concursopintura.model;

import java.util.Scanner;

public class Colegio {
	
	private static Scanner teclado = new Scanner(System.in);

	private String combreColegio;
	private String direccion;
	private String email;
	private String contraseña;
	private String contacto;
	
	
	public Colegio(String combreColegio, String direccion, String email, String contraseña, String contacto) {
		super();
		this.combreColegio = combreColegio;
		this.direccion = direccion;
		this.email = email;
		this.contraseña = contraseña;
		this.contacto = contacto;
	}


	public String getCombreColegio() {
		return combreColegio;
	}


	public void setCombreColegio(String combreColegio) {
		this.combreColegio = combreColegio;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public void RegistrarAlumno(Alumno nuevoAlumno) 
	{
		System.out.println("Nombre");
			String nombre=teclado.next();
			nuevoAlumno.setNombre(nombre);
		System.out.println("Apellidos");
		    String apellidos=teclado.next();
			nuevoAlumno.setApellidos(apellidos);
		System.out.println("Curso");
			String curso=teclado.next();
			nuevoAlumno.setCurso(curso);
		System.out.println("Email");
			String email=teclado.next();
			nuevoAlumno.setEmail(email);
			System.out.println("Fecha Nacimiento");
			String fechaNacimiento=teclado.next();
			nuevoAlumno.setFechaNacimiento(fechaNacimiento);
			
		System.out.println("Hemos Registrado el usuario " + nuevoAlumno.getNombre());
		String freno=teclado.next();
	}
	
	
	
}
