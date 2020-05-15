package com.svalero.concursopintura.model;

import java.util.List;

public class Cuadro {
	
	private String nombreCuadro;
	private String tecnica;
	private String tamaño;
	
	private List<Valoraciones> puntuaciones;
	
	public Cuadro(String nombreCuadro, String tecnica, String tamaño) {
		super();
		this.nombreCuadro = nombreCuadro;
		this.tecnica = tecnica;
		this.tamaño = tamaño;
		
		
	}

	public Cuadro(List<Valoraciones> puntuaciones) {
		super();
		this.puntuaciones = puntuaciones;
	}

	public String getNombreCuadro() {
		return nombreCuadro;
	}

	public void setNombreCuadro(String nombreCuadro) {
		this.nombreCuadro = nombreCuadro;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public List<Valoraciones> getPuntuaciones() {
		return puntuaciones;
	}

	public List<Valoraciones> setPuntuaciones() {
		return puntuaciones;
	}


}
