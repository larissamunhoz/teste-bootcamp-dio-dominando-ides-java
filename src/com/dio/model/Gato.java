package com.dio.model;

public class Gato {
	
	public Gato() {}
	
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	private String nome;
	private String cor;
	private Integer idade;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	/*public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/
}
