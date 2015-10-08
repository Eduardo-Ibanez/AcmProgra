package anyaandsmartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class AnyaandSmartphone {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		
		int aplicaciones=entrada.nextInt();
		int applanzadas=entrada.nextInt();
		int apppantalla=entrada.nextInt();
		
		int pantallas=aplicaciones/apppantalla;
		
		System.out.println(pantallas);
		
		ArrayList<Integer> anya = new ArrayList<Integer>();
		
		for(int i=0;i<aplicaciones;i++){
			anya.add(entrada.nextInt());
		}
		
		
		
		
	
	}

}
