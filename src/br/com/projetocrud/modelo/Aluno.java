package br.com.projetocrud.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {
	
	private float notaFinal;
	private int alunoID;
	
	
	
	public Aluno(String nome, String telefone, String dataCadastro, String dataAltera��o, float notaFinal) {
		super(nome, telefone, dataCadastro, dataAltera��o);
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
		return "Nome: " + super.getNome() + " Telefone: " + super.getTelefone();
	}

	
	
	
	
}
