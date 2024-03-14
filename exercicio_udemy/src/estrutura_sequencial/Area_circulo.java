package estrutura_sequencial;

import java.util.Scanner;

public class Area_circulo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do circulo");
		double raio = scanner.nextDouble();
		
		double area = Math.PI * raio * raio;
		
		System.out.printf("A área do circulo é: %.4f%n", area);	
		
		
	}
}
