package Exerc�cois_Fix;

import java.util.Scanner;

public class ex5_vet {

	public static void main(String[] args) {
				
		int Vsoma=0, Vmedia=0, Valuno=0;
		
		System.out.println("Coleque o n�mero m�ximo de cadastro para os alunos: ");
		Valuno = new Scanner(System.in).nextInt();
		
		String[] nome = new String[Valuno];
		int[] nota = new int[Valuno];
		
		for(int i=0; i<Valuno; i++) {
			System.out.println("Coloque o nome do aluno n� " + (i+1));
			nome[i] = new Scanner (System.in).nextLine();
			
			System.out.println("Insira a nota do aluno n� " + (i+1));
			nota[i] = new Scanner (System.in).nextInt();
			
			Vsoma += nota[i];
		}
		Vmedia = Vsoma / Valuno;
		
		System.out.println("Alunos que tiver�o nota suficiente para passar de per�odo: ");
		for (int i=0; i<Valuno; i++) {
			if (nota[i] > Vmedia) {
				System.out.println("=================================");
				System.out.println(nome[i] + " - " + nota[i]);
				System.out.println("=================================");
			}
		}
	}
}
