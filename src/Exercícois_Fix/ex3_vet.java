package Exercícois_Fix;

import java.util.Locale;
import java.util.Scanner;

/*leia um conjunto de notas, cuja a quantidade seja determinada pelo usuário
						 * Calcule a média de todas elas
						 * Exiba um conjunto das notas maiores do que a média calculada
						 * Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média)*/
public class ex3_vet {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int quantidade;
		double media = 0;
		
		
		System.out.println("Informe a quantidade de notas: ");
		quantidade = input.nextInt();
		double vetor[];
		vetor = new double [quantidade];
		for (int i = 0; i<quantidade; i++) {
			System.out.println("Informa a " + (i + 1) + "ª nota.");
			vetor[i] = input.nextDouble();
		}
		for (int i=0; i<quantidade; i++) {
			media += vetor[i];
		}
		media = media / quantidade;
		System.out.println("A média é: " + media);
		System.out.println ("A média é              : " +media);
        String maior= "Nota(s) acima média    : ", menor= "Nota(s) abaixo da média: ";
		for (int i=0; i<quantidade; i++) {
			if(vetor[i] > media) {
				maior = maior + vetor[i] + "	";
			}
		    else{ 
		    	menor = menor + vetor[i] + "	";
		   }
	 }
		System.out.println(maior);
		System.out.println(menor);
		input.close();
  }
}
