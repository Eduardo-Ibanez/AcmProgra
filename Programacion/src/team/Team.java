package team;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		
		//CODIGO APROBADO EN CODEFORCES

		int cont = 0;
		int suma = 0;

		Scanner entrada = new Scanner(System.in);
		int input = entrada.nextInt();

		for (int i = 0; i < input; i++) {
			int a=entrada.nextInt();
			int b=entrada.nextInt();
			int c=entrada.nextInt();

			suma = a+b+c;
			if (suma>1) {
				cont++;
					}
		}
		System.out.println(cont);

	}
}

