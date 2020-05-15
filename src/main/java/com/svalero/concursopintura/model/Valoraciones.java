package com.svalero.concursopintura.model;

import java.util.ArrayList;
import java.util.List;

public class Valoraciones {
	
	private String cuadro;
	private int puntuacion;
	
	private List<Cuadro> cuadros; 
	
	public Valoraciones(String cuadro, int puntuacion) {
		super();
		this.cuadro = cuadro;
		this.puntuacion = puntuacion;
		
		cuadros = new ArrayList<>();
	}
	
	

	public List<Cuadro> getCuadros() {
		return cuadros;
	}



	public void setCuadros(List<Cuadro> cuadros) {
		this.cuadros = cuadros;
	}



	public String getCuadro() {
		return cuadro;
	}

	public void setCuadro(String cuadro) {
		this.cuadro = cuadro;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	
	public void puntuarCuadro(int puntuacion) {
		if((puntuacion < 0 ) || (puntuacion > 5)) {
			System.out.println("Solo se puede puntuar entre 0 y 5");
		}else
		{
		System.out.println("Cuadro Puntuado");
		}
	}		
}


