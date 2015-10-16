package theatresssquare;

import java.util.Scanner;

public class TheatreSquare {
	
	public static void main(String[] args) {
		
		//CODIGO APROBADO EN CODEFORCES
		
		long n=0;
		long x=0;
		long y=0;
	
	Scanner entrada =new Scanner(System.in);
	
	long ancho= entrada.nextInt();
	long largo= entrada.nextInt();
	long placa=entrada.nextInt();
	
	
	x=ancho/placa;
	if(ancho%placa>0){
		x++;
		
	}
	 y=largo/placa;
	if(largo%placa>0){
		y++;
		
	}
	n=x*y;
	System.out.println(n);
	
	
	
	}
}
