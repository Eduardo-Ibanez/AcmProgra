package team;

import java.util.Scanner;

import watermelon.FileManager;

public class Team {

	public static void main(String[] args) {

		int cont = 0;
		int suma = 0;

		Scanner entrada = new Scanner(System.in);
		int input = entrada.nextInt();

		for (int i = 1; i < (input * 3)+1; i++) {

			suma += entrada.nextInt();
			if (i % 3 == 0) {
				if (suma > 1) {
					cont++;
					suma=0;
				}

			}

		}
		System.out.println(cont);

	}
}
