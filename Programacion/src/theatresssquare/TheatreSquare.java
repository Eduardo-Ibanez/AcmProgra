package theatresssquare;

import java.util.Scanner;

public class TheatreSquare {
	
	public static void main(String[] args) {
		
		int n=0;
		int x=0;
		int y=0;
	
	Scanner entrada =new Scanner(System.in);
	
	int ancho= entrada.nextInt();
	int largo= entrada.nextInt();
	int placa=entrada.nextInt();
	
	
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
