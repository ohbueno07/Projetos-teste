package com.br.octavio.estudo.model;

public class Curso {
	
	private String nome;
	
	private int alunos;
	
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	// getters and setters

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the alunos
	 */
	public int getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

}
