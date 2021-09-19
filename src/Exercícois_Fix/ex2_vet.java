package Exerc�cois_Fix;
							/*L� 5 nomes e nostas de uma turma
							 * Calcula e exibe a m�dia das notas da turma, em seguida
							 * Exibe a rela��o de nomes cuja nota � superior a esta m�dia*/
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
		System.out.println("A m�dia dos alunos �: " + media);
		System.out.println();
		System.out.println("Lista dos alunos cuja a nota � superior a m�dia da turma! ");
		for (int i = 0; i<=4; i++) {
			if(notas[i] > media)
				System.out.println(nomes[i]);
		}
		input.close();
	}
}
