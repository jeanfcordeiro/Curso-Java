package estrutura_while;

import java.util.Scanner;

public class posto_gasolina {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Qual seu combustível? (1.ÁLCOOL  2.GASOLINA  3.DIESEL  4.FIM)");
		
		int combustivel = sc.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool += 1;
			} else if (combustivel == 2){
				gasolina += 1;
			} else if (combustivel == 3) {
				diesel += 1;
			}
			
			combustivel = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Ácool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
