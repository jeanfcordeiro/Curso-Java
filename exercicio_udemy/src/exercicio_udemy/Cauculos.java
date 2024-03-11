package exercicio_udemy;

import java.util.Scanner;

public class Cauculos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor A:");
		double a = sc.nextDouble();
		System.out.println("Valor B:");
		double b = sc.nextDouble();
		System.out.println("Valor C:");
		double c = sc.nextDouble();
		
		double areaTriangulo = (a * c) / 2;
		
		double areaCirculo = Math.PI * c * c;
		
		double areaTrapezio = ((a + b) * c) / 2;
		
		double areaQuadrado = b * b;
		
		double areaRetangulo = a * b;
		
		System.out.println("Área triangulo: " + areaTriangulo);
		System.out.println("Área cirulo: " + areaCirculo);
		System.out.println("Área trapézio: " + areaTrapezio);
		System.out.println("Área quadrado: " + areaQuadrado);
		System.out.println("Área retangulo: " + areaRetangulo);
		
		
		
	}

}
