package estrutura_sequencial;

import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Código da peça 1:");
		int cod1 = sc.nextInt();
		System.out.println("Quanditade de peças:");
		int qnt1 = sc.nextInt();
		System.out.println("Valor unitário da peça 1:");
		double valor1 = sc.nextDouble();
		
		System.out.println("Código da peça 2:");
		int cod2 = sc.nextInt();
		System.out.println("Quanditade de peças:");
		int qnt2 = sc.nextInt();
		System.out.println("Valor unitário da peça 2:");
		double valor2 = sc.nextDouble();
		
		double total = (qnt1 * valor1) + (qnt2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
		
	}

}
