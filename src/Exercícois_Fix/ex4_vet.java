package Exercícois_Fix;
						/*Leia um conjunto de alunos, cada uma com o nome e nota
						 * Em seguida, exiba o nome dos alunos que possuem a nota maior que a média da turma.*/
						 
import java.util.Locale;
import java.util.Scanner;

public class ex4_vet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int soma=0, media=0, qtAluno=0;
		
		System.out.println("Digite a quantidade de alunos que serão cadastrados: ");
		qtAluno = new Scanner(System.in).nextInt();
		
		String[] nome = new String[qtAluno];
		double[] nota = new double[qtAluno];
		
		for (int i=0; i<qtAluno; i++) {
			System.out.println("Insira o nome do aluno nº " + (i+1));
			nome[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Insira a nota do aluno nº " + (i+1));
			nota[i] = new Scanner(System.in).nextDouble();
			
			soma += nota[i];
		}
		media = soma / qtAluno;
		System.out.println();
		System.out.println("Alunos com nota maior que a média da turma ");
		for (int i=0; i<qtAluno; i++) {
			if (nota[i] > media) {
				System.out.println(nome[i] + " - " + nota[i]);
			}
		}
	}
}
