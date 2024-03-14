package estrutura_condicional;

import java.util.Scanner;

public class negativo_positivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Número negatigo");
		} 
		else {
			System.out.println("Número positivo");
		}

		sc.close();
	}
}
