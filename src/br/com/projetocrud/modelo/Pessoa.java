package br.com.projetocrud.modelo;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String dataNascimento;
	private String dataCadastro;
	private String dataAltera��o;
	

	
	public Pessoa(String nome, String telefone, String dataCadastro, String dataAltera��o) {
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
	public String getDataAltera��o() {
		return dataAltera��o;
	}
	public void setDataAltera��o(String dataAltera��o) {
		this.dataAltera��o = dataAltera��o;
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
