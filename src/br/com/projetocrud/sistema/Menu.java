package br.com.projetocrud.sistema;

import java.util.Scanner;


public class Menu {	
	    public void Inicializar () {

	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			Sistema sistema = new Sistema();

			int menu = 0;
			do {		
				System.out.println("Digite para mover entre os menus:");			
				System.out.println("");
				System.out.println("1 - Para cadastrar uma pessoa/aluno");
				System.out.println("2 - Para listar pessoas/alunos");
				System.out.println("3 - Atualizar dados de uma pessoa/aluno");
				System.out.println("4 - Excluir uma pessoa/aluno");
				System.out.println("5 - Encerrar o programa");
				System.out.print("Op��o: ");
			menu = sc.nextInt();
			System.out.println("");
			
			switch(menu) {				
			case 1:
				sistema.Criar();
				break;
			case 2:		
				sistema.ListarPessoas();						
				System.out.println("");					
				sistema.ListarAlunos();
				System.out.println("");	
				break;
			case 3:
				System.out.print("Digite 1 para pessoa ou 2 para aluno: ");
				int op = sc.nextInt();
				sc.nextLine();
				if(op == 1) {
					sistema.AtualizarPessoa();
				}else if (op == 2){
					sistema.AtualizarAluno();
				}else {
					System.out.println("Op��o inv�lida!");
					System.out.println("");
				}				
				break;
			case 4:
				System.out.print("Digite 1 para pessoa ou 2 para aluno: ");
				int op2 = sc.nextInt();
				sc.nextLine();
				if(op2 == 1) {
					sistema.DeletarPessoa();
				}else if (op2 == 2){
					sistema.DeletarAluno();
				}else {
					System.out.println("Op��o inv�lida!");
					System.out.println("");
				}	
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("op��o inv�lida");
			}
			} while (menu != 0);
	    }
}
