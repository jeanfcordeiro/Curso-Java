package estrutura_for;

import java.util.Scanner;

public class quadro_cubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int l = i;
			int q = i * i;
			int c = i * i * i;
			
			System.out.printf("%d %d %d%n", l, q, c);
			
		}
		
		
		sc.close();
	}

}
