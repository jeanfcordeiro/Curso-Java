package estrutura_for;

import java.util.Scanner;

public class in_out {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a quantidade de número a serem lidos?");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os valores:");
			int x = sc.nextInt();

			if (x >= 10 && x >= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " on");
		

		sc.close();
	}

}
