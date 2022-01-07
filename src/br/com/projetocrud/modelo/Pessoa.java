package br.com.projetocrud.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String dataNascimento;
	private LocalDate dataCadastro;
	private LocalDate dataAlteração;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Pessoa(String nome, String telefone, String dataNascimento, LocalDate dataCadastro, LocalDate dataAlteração) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
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
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDate getDataAlteração() {
		return dataAlteração;
	}
	public void setDataAlteração(LocalDate dataAlteração) {
		this.dataAlteração = dataAlteração;
	}
	public String toString() {
		return "Nome: " + getNome() + " | Telefone: " + getTelefone() + " | Data do nascimento: " + getDataNascimento() +
				" | Data do Cadastro: " + dtf.format(getDataCadastro()) + " | Data da ultima alteracao: " + dtf.format(getDataAlteração());
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
