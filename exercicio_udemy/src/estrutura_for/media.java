package estrutura_for;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de testes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2 + b * 3 + c * 5) / 10.0;
			
			System.out.println(media);
		}
		
		
		sc.close();
	}

}
