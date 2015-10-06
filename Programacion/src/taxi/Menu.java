package taxi;



public class Menu {
	
	
public static void main(String[] args) {
	int numgrup; 
	int conttaxi=0;
	int cont1=0;
	int cont2=0;
	int cont3=0;
	int cont4=0;
	int cont[]= new int[4];
	String lineas[] = FileManager.readLines("C:\\Users\\LALOX\\Documents\\workspace\\Progra\\src\\taxi\\input.txt");
	numgrup = Integer.parseInt(lineas[0]); // Linea 1 de txt guardada en arreglo
	String grupos[] = lineas[1].split(" "); // Linea 2 de txt guardada en arreglo
	
	for(int i=0; i<numgrup;i++){//colocar datos en el arreglo
		cont[Integer.parseInt(grupos[i])-1]++;  //Datos Guardados
	}
	for(int i=0; i<2;i++){
	if(cont[3]==1){
		cont4+=cont[3];
	}
	}
	if(cont[2]==1 & cont[0]==cont[3]){
			cont3++;
		}
		
	conttaxi=cont1+cont2+cont3+cont4;
	System.out.println(cont4);
		
	}


}
