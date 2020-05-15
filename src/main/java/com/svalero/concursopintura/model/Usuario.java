package com.svalero.concursopintura.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String email;
	private String contraseña;
	
	private List<Cuadro> cuadros; 
	
	
	public Usuario(String email, String contraseña) {
		super();
		this.email = email;
		this.contraseña = contraseña;
		
		cuadros = new ArrayList<>();
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
	
	

}
