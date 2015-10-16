package taxi;

import java.util.Scanner;

public class Taxis {

	public static void main(String[] args) {
		
		//CODIGO APROBADO EN CODEFORCES
		Scanner entrada = new Scanner(System.in);

		int cont1 = 0, cont2 = 0, cont3 = 0, taxis = 0;
		int numgrup = entrada.nextInt();

		for (int i = 0; i < numgrup; i++) {
			
			int input = entrada.nextInt();
			if (input == 1) {
				cont1++;
			}
			if (input == 2) {
				cont2++;
			}
			if (input == 3) {
				cont3++;
				taxis++;
			}
			if (input == 4) {
				taxis++;
			}
		}
			cont1 -= cont3;

			if (cont2 > 1)
				taxis += cont2 / 2;
			if (cont2 > 0 && cont2 % 2 != 0) {
				taxis++;
				cont1 -= 2;
			}
			if (cont1 > 0) {
				taxis += cont1 / 4;
				if (cont1 % 4 != 0) {
					taxis++;
				}
			}
			System.out.println(taxis);
		

	}

}
