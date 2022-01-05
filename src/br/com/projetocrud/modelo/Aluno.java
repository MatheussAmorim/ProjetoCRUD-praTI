package br.com.projetocrud.modelo;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private float notaFinal;
	
	public Aluno(String nome, int telefone, Date dataCadastro, Date dataAlteração, float notaFinal) {
		super(nome, telefone, dataCadastro, dataAlteração);
		this.notaFinal = notaFinal;
	}
	
}
