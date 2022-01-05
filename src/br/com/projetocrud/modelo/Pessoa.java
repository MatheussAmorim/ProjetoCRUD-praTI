package br.com.projetocrud.modelo;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private int telefone;
	private Date dataCadastro;
	private Date dataAltera��o;
	
	public Pessoa(String nome, int telefone, Date dataCadastro, Date dataAltera��o) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.dataAltera��o = dataAltera��o;	
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataAltera��o() {
		return dataAltera��o;
	}
	public void setDataAltera��o(Date dataAltera��o) {
		this.dataAltera��o = dataAltera��o;
	}
	
	
		

}
