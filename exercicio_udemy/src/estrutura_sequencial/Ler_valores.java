package estrutura_sequencial;

import java.util.Scanner;

public class Ler_valores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = scanner.nextInt();

		int resultado = valor1 + valor2;

		System.out.println("A soma dos valores digitados é: " + resultado);

		scanner.close();
	}
}