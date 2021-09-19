package Exercícois_Fix;
/*Leia dois conjuntos de números (podem ter o tamanho diferente) já ordenados de forma crescete.
 * Crei um outro vetor para armazenar os dois conjuntos unidos, sendo que os números devem permanecer ordenados.
 * Finalmente, exiba este vetor resultante.*/
import java.util.Locale;

public class ex13_vet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int[] a = {5,10,15};
		int[] b = {7,8,9,19,20};
		int[] c = new int [a.length + b.length]; 
		//Ponteiros para os vetores a,b,c.
		int pa=0, pb=0, pc;
		for (pc=0; pc < c.length; pc++) {
			//Se o vetor 'a' foi todo copiado, então coia de 'b'
			if(pa == a.length) {
				c[pc] = b[pb];
				pb++;
			}
			//Se o vetor 'b' foi todo copiado, então copia de 'a'
			else if (pb == b.length) {
				c[pc] = a[pa];
				pa++;
			}
			else if (a[pa] < b[pb]) {
				c[pc] = a[pa];
				pa++;
			}
			else {
				c[pc] = b[pb];
				pb++;
			}
		}
		//exibe o vetor resultante
		for(int i = 0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
