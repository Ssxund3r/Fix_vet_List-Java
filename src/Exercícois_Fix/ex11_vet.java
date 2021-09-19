package Exercícois_Fix;

import java.util.Locale;
import java.util.Scanner;

/*Ordenar vet*/
public class ex11_vet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int i=0, j=0, qtd=0;
		double[] num1;
		double aux;
		
		System.out.print("Entre com a quantidade a ser cadastrada: ");
		qtd = new Scanner (System.in).nextInt();
		
		num1 = new double [qtd];
		
		for(i=0; i <= qtd - 1; i++) {
			System.out.println("Entre com o " + (i+1) +"º número: ");
			num1[i] = new Scanner(System.in).nextDouble();
		}
		for (i=0; i<=qtd-2; i++) {
			for (j= i + 1; j<= qtd - 1; j++) {
				if(num1[j] < num1[i]) {
					aux = num1[j];
					num1[j] = num1[i];
					num1[i] = aux;
				}
			}
		}
		System.out.println("A ordem correta é: ");
		for (i=0; i<=qtd; i++) {
			System.out.println(num1[i]);
			if(i < qtd - 1) {
				System.out.print(", ");
			}else {
				System.out.print(".");
			}
		}
	}

}
