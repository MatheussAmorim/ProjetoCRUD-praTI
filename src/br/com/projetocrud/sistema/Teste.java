package br.com.projetocrud.sistema;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		switch(menu) {
		case 0:
			System.out.println("Digite para mover entre os menus:");
			System.out.println("");
			System.out.println("1 - Para cadastrar uma pessoa/aluno");
			System.out.println("2 - Para listar pessoas/alunos");
			System.out.println("3 - Atualizar dados de uma pessoa/aluno");
			System.out.println("4 - Encerrar o programa");
			menu = sc.nextInt();
			menu = Console.readInt("Opção:");
			
		case 1:
			System.out.println("ts");
		}
		
	}

}
