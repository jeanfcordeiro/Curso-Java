package estrutura_sequencial;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println ("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println ("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		System.out.println ("Digite o quarto valor: ");
		int valor4 = sc.nextInt();

		int dif = (valor1 * valor2 - valor3 * valor4);
		
		System.out.println("A diferença do produto entre os valores é: " + dif);
		
	}
	

}
