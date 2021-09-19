package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i<n; i++) {
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum /n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		input.close();
	}

}
