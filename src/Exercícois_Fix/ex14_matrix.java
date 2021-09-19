package Exercícois_Fix;

import java.util.Arrays;
import java.util.Locale;

public class ex14_matrix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double[] vetor1 = new double[] {2.3, 4.7, 1.4};
		double[] vetor2 = new double[] {1.6, 6.2, 3.5};
		double[] vetor3 = new double[vetor1.length + vetor2.length];
		double soma1, soma2;
		int i;
		
		//Calcular a soma de cada vetor 
		soma1 = 0.0;
		soma2 = 0.0;
		for(i=0; i< vetor1.length; i++)
			soma1 += vetor1[i];
		for(i=0; i < vetor2.length; i++)
			soma2 += vetor2[i];
		
		//Verificar se os vetores estão na ordem pretendida
		if(soma2 > soma1) {
			//troca os vetores, pois estão ao contrário 
			double[] vetortmp = vetor1;
			vetor1 = vetor2;
			vetor2 = vetortmp;
		}
		//Copiar o vetor1 para as primeiras posições do vetor3
		for(i=0; i<vetor1.length; i++)
			vetor3[i] = vetor1[i];
		//Copiar o vetor2 para as últimas posições do vetor3
		for(i=0; i<vetor2.length; i++)
			vetor3[i+vetor1.length] = vetor2[i];
		//Imprimi o vetor no console
		System.out.println(Arrays.toString(vetor3));
	}

}
