package estrutura_condicional;

import java.util.Scanner;

public class intervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if (num < 0 || num > 100) {
			System.out.println("Fora de intervalo");
		} else if (num < 25) {
			System.out.println("Intervalo 0,25");
		} else if (num < 50) {
			System.out.println("Intervalo 25,50");
		} else if (num < 75) {
			System.out.println("Intervalo 50,75");
		} else {
			System.out.println("Intervalo 75,100");
		}
		
		sc.close();
		
	}

}
