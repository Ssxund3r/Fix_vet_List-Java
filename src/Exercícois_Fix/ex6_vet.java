package Exerc�cois_Fix;
							/*Leia um ocnjunto de sal�rios, sendo que para terminar a entrada 
							 * ser� fornecido o valor -1 
							 * Ap�s toda a entrada ter sido realizada, leia o valor do reajuste
							 * Em seguida exiba todos os sal�rios j� reajustados*/
import java.util.Scanner;

public class ex6_vet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] Vsal = new double [200];
		double[] Nsal = new double [200];
		double reaj;
		int cont = 1;
		Vsal[0] = 1;
		
		while (Vsal[(cont -1)] != -1 ) {
			System.out.println("Entre com o valor de salario: " + 1);
			Vsal[cont] = new Scanner (System.in).nextDouble();
			cont += 1;
		}
		System.out.println("Entre com o valor de reajuste: " + 1);
		reaj = new Scanner(System.in).nextDouble();
		for (int i=0; i <=(cont-2); i++) {
			Nsal[i] = ((reaj*Vsal[i]/100) + Vsal[i]);
			System.out.println("Sal�rios com Reajuste: " + Nsal[i]);
		}
		
		
		input.close();
	}

}
