package br.com.projetocrud.modelo;

import java.util.Date;


public class Pessoa {
	
	private String nome;
	private long telefone;
	private String dataCadastro;
	private String dataAlteração;
	
	public Pessoa(String nome, long telefone, String dataCadastro, String dataAlteração) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.dataAlteração = dataAlteração;	
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getDataAlteração() {
		return dataAlteração;
	}
	public void setDataAlteração(String dataAlteração) {
		this.dataAlteração = dataAlteração;
	}
	public String toString() {
		return "Nome: " + nome + "Telefone: " + telefone;
	}
	
		

}
