package br.com.projetocrud.sistema;

import java.util.Scanner;

public class teste2 {
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
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
			System.out.println("4 - Encerrar o programa");
			System.out.print("Opção: ");
			menu = sc.nextInt();
			System.out.println("");
			
			switch(menu) {
			case 0:
				System.out.println("Digite para mover entre os menus:");			
				System.out.println("");
				System.out.println("1 - Para cadastrar uma pessoa/aluno");
				System.out.println("2 - Para listar pessoas/alunos");
				System.out.println("3 - Atualizar dados de uma pessoa/aluno");
				System.out.println("4 - Encerrar o programa");
				System.out.print("Opção: ");
				menu = sc.nextInt();
				System.out.println("");			
			case 1:
				
				sistema.Criar();
				
				
				break;
			case 2:
				System.out.println("opção 2");
				break;
			default:
				System.out.println("opção inválida");
				break;
			}
			} while (menu ==0);
	    }
}
