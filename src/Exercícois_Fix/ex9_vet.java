package Exerc�cois_Fix;

import java.util.Locale;
import java.util.Scanner;

/*Fa�a um programa de consulta de telefoness a partir de um nome informado por uma chave de dados
 * leia os nomes com seus respectivos telefones, sendo a quantidade determinada pelo usu�rio.
 * Em seguida pergunte ao usu�rio qual o nome que ele deseja consultar o telefone.
 * Ap�s sua resposta, exiba o telefone da possoa procurada.*/
public class ex9_vet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int i;
		System.out.println("Quantas pessoas ser�o cadastradas? ");
		i = new Scanner (System.in).nextInt();
		int[] tel = new int [i];
		String[] nome = new String[i];
		
		for (int x=0; x<i; x++) {
			System.out.println("Cadastre a pessoa n�mero: " + (x + 1));
			nome [x] = new Scanner(System.in).next();
			System.out.println("Cadastree o telefone da pessoa n�mero " + (x + 1));
			tel [x] = new Scanner (System.in).nextInt();
		}
		String buscaNome;
		System.out.println("Digite o nome do cliente: ");
		buscaNome = new Scanner(System.in).next();
		boolean inexistente = true;
		for (int x=0; x<i; x++) {
			if (buscaNome.equals(nome [x])) {
				System.out.println(nome[x]);
				System.out.println(tel[x]);
				inexistente = false;
			}
		}
		if (inexistente) {
			System.out.println("Nome inexistente");
		}
				
	}
}
