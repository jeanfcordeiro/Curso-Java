package estrutura_condicional;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}

		sc.close();

	}

}
