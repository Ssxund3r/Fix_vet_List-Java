package Exerc�cois_Fix;
						/*Crei um vetor capaz de armazenar 50 n�meros inteiros. 
						 *Em seguida fa�a o seu preenchimento autom�tico com os n�meros de 101 � 150.
						 *Ou seja, na posi��o n� 0 ponha 101, na posi��o 1 ponha 102.....
						 *Exiba os valores deste vetor. */
import java.util.Locale;

public class ex7_vet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int[] n = new int [50]; 
		int c=0;
		
		for (int i=101; i<151; i++) {
			n[c] = i;
			c++;
		}
		for (int i=0; i<49; i++) {
			System.out.println(n[i]);
		}
	}
}
