package taxi;

import java.util.Scanner;

public class Taxis {

	public static void main(String[] args) {

		int numgrup;
		
		int cont[]= new int[4];
		
		String lineas[] = FileManager.readLines("C:\\Users\\LALOX\\Documents\\workspace\\Progra\\src\\taxi\\input.txt");
		
		Scanner entrada=new Scanner(System.in);
		
		numgrup = entrada.nextInt();
		
		int grupos[] = new int[numgrup];
		for(int i=0;i<numgrup;i++){
			grupos[i]=entrada.nextInt();
		
		for( i=0; i<numgrup;i++){//colocar datos en el arreglo
			
			cont[(grupos[i])-1]++;  
		}
		for ( i=0; i<cont.length;i++) {
			
			System.out.println("El numero de: "+(i+1)+" Es: "+cont[i]);
		}
		

	}

}

	}

}
