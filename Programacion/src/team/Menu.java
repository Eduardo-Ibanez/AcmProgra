package team;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int suma = 0;

		Scanner entrada = new Scanner(System.in);

		int numpreguntas = entrada.nextInt();
		int respuestas[] = new int[numpreguntas];

		for (int i = 0; i < numpreguntas; i++) {
			int entradas = entrada.nextInt();
			respuestas[i] = entradas;
			suma += respuestas[i] + respuestas[i+1] + respuestas[i+2];
			System.out.println(suma);
			if (suma >= 2) {
				cont++;
			}
			

		}

		System.out.println(cont);

	}

}
