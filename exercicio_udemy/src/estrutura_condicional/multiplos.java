package estrutura_condicional;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número");
		double a = sc.nextDouble();
		System.out.println("Digite o segundo número");
		double b = sc.nextDouble();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}
