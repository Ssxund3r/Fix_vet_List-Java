package Exercícois_Fix;
										/*Leia um vetor de N posições
										 *leia dois valores x e y 
										 *procure os valores aemazenados nos índices x e y do vetor
										 *imprima a soma destes valores*/
										 	
import java.util.Scanner;

public class ex1_vet {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//declaração do vetor
		int [] vetor = new int[5];
		
		//declaração das variáveis
		int x, y;
		
		//Entrada de dados -> variável
		for (int i = 0; i<vetor.length; i++) {
			System.out.printf("Digite um valor para N posição ", + i);
			vetor[i] = input.nextInt();
		}
		
		//Entrada de dados -> variável 
		//índice x 
		System.out.println("Digite um valor para o índice X (entre 0 e 4)");
		x = input.nextInt();
		
		//Entrada de dados -> variável 
		//índice y
		System.out.println("Digite um valor para o índice Y(entre 0 e 4)");
		y = input.nextInt();
		
		//Impressão da soma dos dados dentro do índice X e Y
		System.out.printf("A soma dos valores dentro dos índices " + vetor[x]+vetor[y]);
	
		input.close();
	}

}
