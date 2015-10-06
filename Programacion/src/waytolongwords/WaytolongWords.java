package waytolongwords;

import java.util.Scanner;

public class WaytolongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int numpalabras = entrada.nextInt();

		String palabras[] = new String[numpalabras];

		for (int i = 0; i < numpalabras; i++) {

			String palabra = entrada.next();
			
			String dato = "";

			if (palabra.length() >= 10) {

				int letras = palabra.length() - 2;

				dato = (palabra.charAt(0) + "" + letras + "" + palabra.charAt(palabra.length() - 1));
			} else {
				dato = palabra;
			}
			palabras[i] = dato;
		}
		for (int i = 0; i < numpalabras; i++) {
			System.out.println(palabras[i]);
		}

	}

}
