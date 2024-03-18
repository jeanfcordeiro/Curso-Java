package estrutura_for;

import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas divisões fazer? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o dividendo: ");
			int x = sc.nextInt();
			System.out.println("Digite o divisor: ");
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divisão impossível.");
			} else {
				double res = (double) x / y;
				System.out.println(res);
			}
		}

		sc.close();
	}

}
