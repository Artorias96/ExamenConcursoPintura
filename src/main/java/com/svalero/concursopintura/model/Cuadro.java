package com.svalero.concursopintura.model;

import java.util.List;

public class Cuadro {
	
	private String nombreCuadro;
	private String tecnica;
	private String tama�o;
	
	private List<Valoraciones> puntuaciones;
	
	public Cuadro(String nombreCuadro, String tecnica, String tama�o) {
		super();
		this.nombreCuadro = nombreCuadro;
		this.tecnica = tecnica;
		this.tama�o = tama�o;
		
		
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public List<Valoraciones> getPuntuaciones() {
		return puntuaciones;
	}

	public List<Valoraciones> setPuntuaciones() {
		return puntuaciones;
	}


}
