package watermelon;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {

	int resto;
	String salida = "";

		Scanner entrada = new Scanner(System.in);
		int input=entrada.nextInt();

		resto = (input % 2);

		if (resto == 1) {
			salida = "NO";
		}
		if (resto == 0) {
			salida = "YES";
		}
		
		System.out.println(salida);
		

	}
	}


