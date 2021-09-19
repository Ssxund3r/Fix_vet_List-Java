package Exercícois_Fix;
							/*Lê 5 nomes e nostas de uma turma
							 * Calcula e exibe a média das notas da turma, em seguida
							 * Exibe a relação de nomes cuja nota é superior a esta média*/
import java.util.Locale;
import java.util.Scanner;

public class ex2_vet {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String[] nomes = new String[5];
		double[] notas = new double[5];
		double soma = 0, media;
		
		for (int i = 0; i<=4; i++) {
			System.out.println("Entre com o nome do aluno: " + (i+1));
			nomes[i] = new Scanner(System.in).nextLine();
			System.out.println("Entre com a nota do aluno: " + (i+1));
			notas[i] = new Scanner(System.in).nextDouble();
			soma += notas[i]; 
		}
		media = soma / 5;
		System.out.println("A média dos alunos é: " + media);
		System.out.println();
		System.out.println("Lista dos alunos cuja a nota é superior a média da turma! ");
		for (int i = 0; i<=4; i++) {
			if(notas[i] > media)
				System.out.println(nomes[i]);
		}
		input.close();
	}
}
