package br.com.projetocrud.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String dataNascimento;
	private LocalDate dataCadastro;
	private LocalDate dataAltera��o;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	
	public Pessoa(String nome, String telefone, String dataNascimento, LocalDate dataCadastro, LocalDate dataAltera��o) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.dataAltera��o = dataAltera��o;	
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
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDate getDataAltera��o() {
		return dataAltera��o;
	}
	public void setDataAltera��o(LocalDate dataAltera��o) {
		this.dataAltera��o = dataAltera��o;
	}
	public String toString() {
		return "Nome: " + getNome() + " | Telefone: " + getTelefone() + " | Data do nascimento: " + getDataNascimento() +
				" | Data do Cadastro: " + dtf.format(getDataCadastro()) + " | Data da ultima alteracao: " + dtf.format(getDataAltera��o());
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
		

}
