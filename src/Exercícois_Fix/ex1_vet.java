package Exerc�cois_Fix;
										/*Leia um vetor de N posi��es
										 *leia dois valores x e y 
										 *procure os valores aemazenados nos �ndices x e y do vetor
										 *imprima a soma destes valores*/
										 	
import java.util.Scanner;

public class ex1_vet {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//declara��o do vetor
		int [] vetor = new int[5];
		
		//declara��o das vari�veis
		int x, y;
		
		//Entrada de dados -> vari�vel
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("Digite um valor para N posi��o ", + i);
			vetor[i] = input.nextInt();
		}
		
		//Entrada de dados -> vari�vel 
		//�ndice x 
		System.out.println("Digite um valor para o �ndice X (entre 0 e 4)");
		x = input.nextInt();
		
		//Entrada de dados -> vari�vel 
		//�ndice y
		System.out.println("Digite um valor para o �ndice Y(entre 0 e 4)");
		y = input.nextInt();
		
		//Impress�o da soma dos dados dentro do �ndice X e Y
		System.out.printf("A soma dos valores dentro dos �ndices " + vetor[x]+vetor[y]);
	
		input.close();
	}

}
