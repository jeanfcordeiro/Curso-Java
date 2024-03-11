package exercicio_udemy;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu número");
		double num = sc.nextDouble();		
		System.out.println("Digite a quantidade de horas trabalhadas");
		double horas = sc.nextDouble();
		System.out.println("Digite o valor por hora");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;

		System.out.printf("Número do funcionário: %.2f%n", num);
		System.out.printf("Salário do funcionário: %.2f%n", salario);

		
		sc.close();
	
		
	}

}
