package br.com.projetocrud.modelo;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private float notaFinal;
	
	public Aluno(String nome, long telefone, String dataCadastro, String dataAlteração, float notaFinal) {
		super(nome, telefone, dataCadastro, dataAlteração);
		this.notaFinal = notaFinal;
	}
	
}
