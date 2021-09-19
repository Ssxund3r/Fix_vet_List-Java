package Exercícois_Fix;

import java.util.Locale;
import java.util.Scanner;

public class ex12_vet {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int i=0, j=0, qtd=0;
		String[] num1;
		String aux;
		
		System.out.println("Entre com a quantidade de pessoas a serem cadastradas: ");
		qtd = new Scanner (System.in).nextInt();
		
		num1= new String [qtd];
		
		for (i=0; i<=qtd -1; i++) {
			System.out.println("Entre com o nome da " + (i+1) + "ª pessoa: ");
			num1[i] = new Scanner (System.in).nextLine();
		}
		for (i=0; i<=qtd-2; i++) {
			for (j=i+1; j<=qtd-1; j++) {
				if (num1[j].compareTo(num1[i])< 0) {
					aux =num1[j];
					num1[j] = num1[i];
					num1[i] = aux;
				}
			}
		}
		System.out.println("A ordem correta é: ");
		for(i=0; i<=qtd-1; i++) {
			System.out.println(num1[i]);
			if (i<qtd-1) {
				System.out.println(", ");
				
			}else
				System.out.println(".");
		}
		
		

	}

}
