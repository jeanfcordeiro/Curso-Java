package estrutura_for;

import java.util.Scanner;

public class mostrar_impares {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int x = sc.nextInt();
		
		
		for (int i=1; i<=x; i++){
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}		
		
		sc.close();
		
	}

}
