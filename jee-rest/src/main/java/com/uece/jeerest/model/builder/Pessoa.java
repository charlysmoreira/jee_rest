package com.uece.jeerest.model.builder;

public class Pessoa {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String informacoes;

	private Pessoa(PessoaBuilder builder) {
		this.nome = builder.nome;
		this.cpf = builder.cpf;
		this.dataNascimento = builder.dataNascimento;
		this.endereco = builder.endereco;
		this.bairro = builder.bairro;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.informacoes = builder.informacoes;
	}

	public static class PessoaBuilder {
		private String nome;
		private String cpf;
		private String dataNascimento;
		private String endereco;
		private String bairro;
		private String cidade;
		private String estado;
		private String informacoes;

		public PessoaBuilder(String nome, String cpf) {
			this.nome = nome;
			this.cpf = cpf;
		}

		public PessoaBuilder dataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
			return this;
		}

		public PessoaBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public PessoaBuilder bairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public PessoaBuilder cidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		public PessoaBuilder estado(String estado) {
			this.estado = estado;
			return this;
		}

		public PessoaBuilder informacoes(String informacoes) {
			this.informacoes = informacoes;
			return this;
		}

		public Pessoa build() {
			return new Pessoa(this);
		}
	}
}
