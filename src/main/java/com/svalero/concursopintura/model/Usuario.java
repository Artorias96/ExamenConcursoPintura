package com.svalero.concursopintura.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String email;
	private String contrase�a;
	
	private List<Cuadro> cuadros; 
	
	
	public Usuario(String email, String contrase�a) {
		super();
		this.email = email;
		this.contrase�a = contrase�a;
		
		cuadros = new ArrayList<>();
	}
	
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	

}
