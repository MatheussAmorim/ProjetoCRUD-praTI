package br.com.projetocrud.sistema;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.com.projetocrud.modelo.Aluno;
import br.com.projetocrud.modelo.Pessoa;
import br.com.projetocrud.sistema.Menu;

public class Sistema {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
	
	String nomeAux;
	long telefoneAux;
	String dataNascimentoAux;
	float notaFinalAux = 0;
	Menu menu = new Menu();

	public void Criar()  {
		
		System.out.print("Digite o nome:");	
		nomeAux = sc.nextLine();
		
		System.out.print("Digite o telefone:");	
		telefoneAux = sc.nextLong();
		
		System.out.print("Digite a data de nascimento:");			
		dataNascimentoAux = sc2.nextLine();
		 	
		System.out.print("Digite a nota:");	
		notaFinalAux = sc.nextFloat();
		
		if(notaFinalAux == 0) {
			CriarPessoa();		
		}else{
			CriarAluno();			
		}
		
		
		System.out.println();	
		
		menu.MenuPrincipal();
	}
	
	/*
	 * Cria um objeto pessoa e o referência na lista.
	 * */
	public void CriarPessoa() {
		Pessoa p1 = new Pessoa(nomeAux, telefoneAux, dataNascimentoAux, dataNascimentoAux);
		listaPessoa.add(p1);
	}	
	
	/*
	 * Cria um objeto aluno e o referência na lista.
	 * */
	public void CriarAluno() {
		Aluno a1 = new Aluno(nomeAux, telefoneAux, dataNascimentoAux, dataNascimentoAux, notaFinalAux );
		listaAluno.add(a1);	
	}
	
	/*
	 * Imprime no console a lista de Pessoas cadastradas.
	 * */
	public void ListarPessoas() {
		for(Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
		}
	}
	
	/*
	 * Imprime no console a lista de Alunos cadastradas.
	 * */
	public void ListarAlunos() {
		for(Aluno aluno : listaAluno) {
			System.out.println(aluno);
		}
	}
	
}
