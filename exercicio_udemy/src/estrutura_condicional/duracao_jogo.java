package estrutura_condicional;

import java.util.Scanner;

public class duracao_jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o horário inicial: ");
		int a = sc.nextInt();
		System.out.println("Digite o horário final: ");
		int b = sc.nextInt();

		int x;

		if (b > a) {
			x = b - a;
		} else {
			x = (24 - a) + b;
		}

		System.out.println("O jogo durou " + x + " horas");
		
		sc.close();
	}

}
