package com.uece.jeerest.model.facade;

public class DesenhoImpl {
	private Desenho circulo;
	private Desenho retangulo;

	public DesenhoImpl() {
		circulo = new Circulo();
		retangulo = new Retangulo();
	}

	public String desenharCirculo() {
		return circulo.desenhar();
	}

	public String desenharRetangulo() {
		return retangulo.desenhar();
	}
}
