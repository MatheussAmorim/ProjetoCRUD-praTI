package br.com.projetocrud.modelo;

import java.time.LocalDate;


public class Aluno extends Pessoa {
	
	private float notaFinal;
	private int alunoID;
	
	
	
	public Aluno(String nome, String telefone, String dataNascimento, LocalDate dataCadastro, LocalDate dataAlteração, float notaFinal) {
		super(nome, telefone, dataNascimento, dataCadastro, dataAlteração);
		this.notaFinal = notaFinal;
	}
	
	public int getAlunoID() {
		return alunoID;
	}

	public void setAlunoID(int alunoID) {
		this.alunoID = alunoID;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public String toString() {
		return "Nome: " + getNome() + " | Telefone: " + getTelefone() + " | Data do nascimento: " + getDataNascimento() + 
		 " | Nota final: " + getNotaFinal() + " | Data do Cadastro: " + dtf.format(getDataCadastro()) + " | Data da ultima alteracao: " +
		dtf.format(getDataAlteração());
	}

	
	
	
	
}
