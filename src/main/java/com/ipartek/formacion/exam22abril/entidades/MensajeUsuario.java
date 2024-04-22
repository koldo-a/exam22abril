package com.ipartek.formacion.exam22abril.entidades;

public class MensajeUsuario {

	private String texto;
	private int duracion;

	public MensajeUsuario(String texto, int duracion) {
		super();
		this.texto = texto;
		this.setDuracion(duracion);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
