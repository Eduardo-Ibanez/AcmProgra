package taxi;





public class Taxi {

	public static void main(String[] args) {
	
		int numgrup;
		
		int cont[]= new int[4];
		
		String lineas[] = FileManager.readLines("C:\\Users\\LALOX\\Documents\\workspace\\Progra\\src\\taxi\\input.txt");
		
		numgrup = Integer.parseInt(lineas[0]);
		
		String grupos[] = lineas[1].split(" ");
		
		for(int i=0; i<numgrup;i++){//colocar datos en el arreglo
			
			cont[Integer.parseInt(grupos[i])-1]++;  
		}
		for (int i=0; i<cont.length;i++) {
			
			System.out.println("El numero de: "+(i+1)+" Es: "+cont[i]);
		}
		

	}

}
