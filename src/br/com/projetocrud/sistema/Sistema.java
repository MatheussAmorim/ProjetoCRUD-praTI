package br.com.projetocrud.sistema;

import java.util.Scanner;

public class Sistema {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);

	public void Criar() {
		String nomeAux;
		long telefoneAux;
		String dataNascimentoAux;
		float notaFinalAux;
		
		
		System.out.print("Digite o nome:");	
		nomeAux = sc.nextLine();
		
		System.out.print("Digite o telefone:");	
		telefoneAux = sc.nextLong();
		
		
		System.out.print("Digite a data de nascimento:");			
		dataNascimentoAux = sc2.nextLine();
		
		System.out.print("Digite a nota:");	
		notaFinalAux = sc.nextFloat();
		

		
		
		System.out.println();

		
		
		System.out.println(nomeAux + " " + telefoneAux + " " + dataNascimentoAux + " " + notaFinalAux);
	}
}
