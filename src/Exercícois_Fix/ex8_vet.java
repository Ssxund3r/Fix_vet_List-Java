package Exercícois_Fix;

import java.util.Locale;

/*Crei um vetor capaz de armazenar 50 números inteiros. 
 *Em seguida faça o seu preenchimento automático com os números de 101 à 150.
 *Ou seja, na posição nº 0 ponha 101, na posição 1 ponha 102.....
 *Exiba os valores deste vetor. */
public class ex8_vet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int[] n= new int[50];
		for (int i=101; i<150; i++) {
			n[i-101] = i;
		}
		for (int i=0; i<49; i++) {
			System.out.println("Posição: " + (i+1));
			System.out.println(n[i] + " ");
		}

	}

}
