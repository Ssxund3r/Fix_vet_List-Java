package Exercícois_Fix;
/*Leia um conjunto de números. Exiba-os em ordem numérica crescente.*/
public class ex10_vet {

	public static void main(String[] args) {
		//Declara um vetor para 5 inteiros.
		int[] num = new int[5];
		
		System.out.println("Sorteando números.... ");
		//preenche os elementos do vetor com números aleatórios de 10 a 30
		for (int i=0; i<5; i++) {
			num[i] = (int) (Math.random()* 21) + 10;
		}
		//A partir deste ponto, o algoritmo irá colocar os números em ordem crescente 
		int aux;
		boolean trocou = true;
		while(trocou) {
			trocou = false;
			for (int i=0; i<4; i++) {
				if (num[i] > num[i+1]) {
				aux = num[i];
				num[i] = num[i+1];
				num[i+1] = aux;
				trocou = true;
		  }
		}
	  }
	  //Exibição do resultado da ordenação 
		System.out.println("Vetor Ordenado: ");
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
	}

}
