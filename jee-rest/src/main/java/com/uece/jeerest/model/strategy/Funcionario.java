package com.uece.jeerest.model.strategy;

import com.uece.jeerest.enumerations.Cargo;

public class Funcionario {

	private String nome;

	private Cargo cargo;

	private Double salario;

	public Funcionario(String nome, Cargo cargo) {
		super();
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
