package br.com.projetocrud.sistema;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.com.projetocrud.modelo.Aluno;
import br.com.projetocrud.modelo.Pessoa;
import br.com.projetocrud.sistema.Menu;
import br.com.projetocrud.sistema.Main;

public class Sistema {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
	
	String nomeAux;
	String telefoneAux;
	String dataNascimentoAux;
	float notaFinalAux;

	public void Criar()  {
		
		System.out.print("Digite o nome:");	
		nomeAux = sc.nextLine();
		
		System.out.print("Digite o telefone:");	
		telefoneAux = sc2.nextLine();
		
		System.out.print("Digite a data de nascimento:");			
		dataNascimentoAux = sc.nextLine();
		 	
		System.out.print("Digite a nota:");	
		notaFinalAux = sc.nextFloat();
		sc.nextLine();
		
		if(notaFinalAux == 0) {
			CriarPessoa();		
		}else{
			CriarAluno();			
		}

		System.out.println();	
		
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
		int aux = 1;
		for(Pessoa pessoa : listaPessoa) {
			System.out.print(aux + " - ");
			System.out.println(pessoa);
			aux++;
		}
	}
	
	/*
	 * Imprime no console a lista de Alunos cadastradas.
	 * */
	public void ListarAlunos() {
		int aux = 1;
		for(Aluno aluno : listaAluno) {
			System.out.print(aux + " - ");
			System.out.println(aluno);
			aux++;
		}
	}
	
	/*
	 * Atualiza os dados de uma Pessoa.
	 * */
	public void AtualizarPessoa() {
		ListarPessoas();
	
		System.out.print("Informe o número que deseja alterar: ");
		int pLista = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1 - Alterar nome");
		System.out.println("2 - Alterar telefone");
		System.out.println("3 - Alterar data de nascimento");
		int pDados = sc.nextInt();
		sc.nextLine();
		
		if(pDados == 1) {
			System.out.print("Digite o novo nome: ");
			nomeAux = sc.nextLine();
			Pessoa pessoa = (Pessoa) listaPessoa.get(pLista-1);
			pessoa.setNome(nomeAux);
			
		}else if(pDados == 2) {
			System.out.print("Digite o novo telefone: ");
			telefoneAux = sc.nextLine();
			Pessoa pessoa = (Pessoa) listaPessoa.get(pLista-1);
			pessoa.setTelefone(telefoneAux);
			
		}else if(pDados == 3) {
			System.out.print("Digite a nova data de nascimento: ");
			dataNascimentoAux = sc.nextLine();
			Pessoa pessoa = (Pessoa) listaPessoa.get(pLista-1);
			pessoa.setDataCadastro(dataNascimentoAux);
			
		}else {
			System.out.println("Opção inválida");
		}
		
	}
	
	/*
	 * Atualiza os dados de um Aluno.
	 * */
	public void AtualizarAluno() {
		ListarAlunos();
	}	
	
}
