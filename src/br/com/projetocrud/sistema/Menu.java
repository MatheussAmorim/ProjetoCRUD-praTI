package br.com.projetocrud.sistema;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.projetocrud.modelo.Aluno;
import br.com.projetocrud.modelo.Pessoa;

public class Menu {	
	    public void Inicializar () {

	    	Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Sistema sistema = new Sistema();
			
	    	String n;
	    	int t;

			int menu = 0;
			do {		
				System.out.println("Digite para mover entre os menus:");			
				System.out.println("");
				System.out.println("1 - Para cadastrar uma pessoa/aluno");
				System.out.println("2 - Para listar pessoas/alunos");
				System.out.println("3 - Atualizar dados de uma pessoa/aluno");
				System.out.println("4 - Excluir uma pessoa/aluno");
				System.out.println("5 - Encerrar o programa");
				System.out.print("Opção: ");
			menu = sc.nextInt();
			System.out.println("");
			
			switch(menu) {				
			case 1:
				sistema.Criar();
				break;
			case 2:
				System.out.println("Lista de Pessoas:");
				sistema.ListarPessoas();
						
				System.out.println("");	
				
				System.out.println("Lista de Alunos:");
				sistema.ListarAlunos();
				System.out.println("");	
				break;
			case 3:
				System.out.print("Digite 1 para pessoa ou 2 para aluno: ");
				int op = sc2.nextInt();
				if(op == 1) {
					sistema.AtualizarPessoa();
				}else if (op == 2){
					sistema.AtualizarAluno();
				}else {
					System.out.println("Opção inválida!");
					System.out.println("");
				}
				
				break;
			case 4:
				break;
			default:
				System.out.println("opção inválida");
			}
			} while (menu != 0);
	    }
}
