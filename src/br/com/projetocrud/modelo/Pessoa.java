package br.com.projetocrud.modelo;

import java.util.ArrayList;
import java.util.Date;


public class Pessoa {
	
	private String nome;
	private String telefone;
	private String dataNascimento;
	private String dataCadastro;
	private String dataAlteração;
	

	
	public Pessoa(String nome, String telefone, String dataCadastro, String dataAlteração) {
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
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
		return "Nome: " + nome + " Telefone: " + telefone;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
		

}
