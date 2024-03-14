package estrutura_condicional;

import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto: ");
		short cod = sc.nextShort();
		System.out.println("Digite a quantidade: ");
		short quantidade = sc.nextShort();

		double total = 0;
		if (cod == 1) {
			total = quantidade * 4.0;
		} else if (cod == 2) {
			total = quantidade * 4.5;
		} else if (cod == 3) {
			total = quantidade * 5;
		} else if (cod == 4) {
			total = quantidade * 2;
		} else if (cod == 5) {
			total = quantidade * 1.5;
		}
		
		System.out.println("Total: " + total);
		sc.close();
	}

}
