package Exerc�cois_Fix;
/*Leia um conjunto de n�meros. Exiba-os em ordem num�rica crescente.*/
public class ex10_vet {

	public static void main(String[] args) {
		//Declara um vetor para 5 inteiros.
		int[] num = new int[5];
		
		System.out.println("Sorteando n�meros.... ");
		//preenche os elementos do vetor com n�meros aleat�rios de 10 a 30
		for (int i=0; i<5; i++) {
			num[i] = (int) (Math.random()* 21) + 10;
		}
		//A partir deste ponto, o algoritmo ir� colocar os n�meros em ordem crescente 
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
	  //Exibi��o do resultado da ordena��o 
		System.out.println("Vetor Ordenado: ");
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
	}

}
