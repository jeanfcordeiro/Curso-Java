package estrutura_condicional;

import java.util.Scanner;

public class imposto_renda {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe seu salário: ");
		double salario = sc.nextDouble();
		
		double ir = 0;
		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario < 3000) {
			ir = (salario - 2000) * 0.08; 
		} else if (salario < 4500) {
			ir = (salario - 3000) * 0.18 + 1000 * 0.08;
		} else {
			ir = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		
		System.out.println("Impost: R$ " + ir);
		
		sc.close();
			
	}
	
}
