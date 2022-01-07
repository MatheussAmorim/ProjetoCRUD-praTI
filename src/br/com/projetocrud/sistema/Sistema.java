package br.com.projetocrud.sistema;

import java.util.ArrayList; 
import java.util.Scanner;
import java.time.LocalDate;

import br.com.projetocrud.modelo.Aluno;
import br.com.projetocrud.modelo.Pessoa;

public class Sistema {

	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);

	ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
	

	/*
	 * Atributos auxiliares
	 */
	String nomeAux;
	String telefoneAux;
	String dataNascimentoAux;
	float notaFinalAux;
	LocalDate dataCadastroAux;
	LocalDate dataAlteracaoAux;

	/*
	 * Cria um objeto do tipo pessoa ou aluno, conforme os dados do input.
	 */
	public void Cadastrar() {
		System.out.print("Digite o nome:");
		nomeAux = sc.nextLine();
		System.out.print("Digite o telefone:");
		telefoneAux = sc.nextLine();
		System.out.print("Digite a data de nascimento *dd/MM/aaaa*:");
		dataNascimentoAux = sc.nextLine();
		System.out.print("Digite a nota:");
		notaFinalAux = sc.nextFloat();
		sc.nextLine();
		dataCadastroAux = LocalDate.now();
		dataAlteracaoAux = LocalDate.now();

		if (notaFinalAux == 0) {
			CriarPessoa();
		} else {
			CriarAluno();
		}
		System.out.println();
	}

	/*
	 * Cria um objeto pessoa e o referência na lista.
	 */
	public void CriarPessoa() {
		Pessoa p1 = new Pessoa(nomeAux, telefoneAux, dataNascimentoAux, dataCadastroAux, dataAlteracaoAux);
		listaPessoa.add(p1);
	}

	/*
	 * Cria um objeto aluno e o referência na lista.
	 */
	public void CriarAluno() {
		Aluno a1 = new Aluno(nomeAux, telefoneAux, dataNascimentoAux, dataCadastroAux, dataAlteracaoAux, notaFinalAux);
		listaAluno.add(a1);
	}

	/*
	 * Imprime no console a lista de Pessoas cadastradas.
	 */
	public void ListarPessoas() {
		System.out.println("Lista de Pessoas:");
		int aux = 1;
		for (Pessoa pessoa : listaPessoa) {
			System.out.print(aux + " - ");
			System.out.println(pessoa);
			aux++;
		}
	}

	/*
	 * Imprime no console a lista de Alunos cadastradas.
	 */
	public void ListarAlunos() {
		System.out.println("Lista de Alunos:");
		if (listaAluno.size() != 0) {
			int aux = 1;
			for (Aluno aluno : listaAluno) {
				System.out.print(aux + " - ");
				System.out.println(aluno);
				aux++;
			}
		} else {
			System.out.println("Nenhum aluno cadastrado.");
		}
	}

	/*
	 * Atualiza os dados de uma Pessoa.
	 */
	public void AtualizarPessoa() {
		ListarPessoas();

		System.out.print("Informe o número que deseja alterar: ");
		int pLista = sc.nextInt();
		sc.nextLine();

		Pessoa pessoa = (Pessoa) listaPessoa.get(pLista - 1);
		
		System.out.println("1 - Alterar nome");
		System.out.println("2 - Alterar telefone");
		System.out.println("3 - Alterar data de nascimento");
		int pDados = sc.nextInt();
		sc.nextLine();

		dataAlteracaoAux = LocalDate.now();

		if (pDados == 1) {
			System.out.print("Digite o novo nome: ");
			nomeAux = sc.nextLine();
			pessoa.setNome(nomeAux);
			pessoa.setDataAlteração(dataAlteracaoAux);

		} else if (pDados == 2) {
			System.out.print("Digite o novo telefone: ");
			telefoneAux = sc.nextLine();
			pessoa.setTelefone(telefoneAux);
			pessoa.setDataAlteração(dataAlteracaoAux);

		} else if (pDados == 3) {
			System.out.print("Digite a nova data de nascimento: ");
			dataNascimentoAux = sc.nextLine();
			pessoa.setDataNascimento(dataNascimentoAux);
			pessoa.setDataAlteração(dataAlteracaoAux);

		} else {
			System.out.println("Opção inválida");
		}

	}

	/*
	 * Atualiza os dados de um Aluno.
	 */
	public void AtualizarAluno() {
		ListarAlunos();

		System.out.print("Informe o número que deseja alterar: ");
		int aLista = sc.nextInt();
		sc.nextLine();

		Aluno aluno = (Aluno) listaAluno.get(aLista - 1);

		System.out.println("1 - Alterar nome");
		System.out.println("2 - Alterar telefone");
		System.out.println("3 - Alterar data de nascimento");
		System.out.println("4 - Alterar nota final");
		int aDados = sc.nextInt();
		sc.nextLine();

		if (aDados == 1) {
			System.out.print("Digite o novo nome: ");
			nomeAux = sc.nextLine();
			aluno.setNome(nomeAux);

		} else if (aDados == 2) {
			System.out.print("Digite o novo telefone: ");
			telefoneAux = sc.nextLine();
			aluno.setTelefone(telefoneAux);

		} else if (aDados == 3) {
			System.out.print("Digite a nova data de nascimento: ");
			dataNascimentoAux = sc.nextLine();
			aluno.setDataNascimento(dataNascimentoAux);

		} else if (aDados == 4) {
			System.out.print("Digite a nova nota final: ");
			notaFinalAux = sc.nextFloat();
			sc.nextLine();
			aluno.setNotaFinal(notaFinalAux);
		} else {
		}
		System.out.println("Opção inválida");
	}

	/*
	 * Deleta a Pessoa da lista.
	 */
	public void DeletarPessoa() {
		ListarPessoas();
		System.out.print("Informe o número que deseja excluir: ");
		int pLista2 = sc.nextInt();
		sc.nextLine();
		listaPessoa.remove(pLista2 - 1);	
	}
	
	/*
	 * Deleta o Aluno da lista.
	 */
	public void DeletarAluno() {
		ListarAlunos();
		System.out.print("Informe o número que deseja excluir: ");
		int pLista2 = sc.nextInt();
		sc.nextLine();
		listaAluno.remove(pLista2 - 1);
	}
}
