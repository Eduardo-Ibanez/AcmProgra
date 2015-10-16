package anyaandsmartphone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnyaandSmartphone {

	public static void main(String[] args) {
		//CODIGO APROBADO EN CODEFORCES
		int app = 0;
		long acciones = 0;
		
	
		Scanner entrada=new Scanner(System.in);
		
		int aplicaciones=entrada.nextInt();  //obteniedo el total  de aplicaiones 
		int applanzadas=entrada.nextInt();   //obteniendo el total de apps que ejecutaran
		int apppantalla=entrada.nextInt();   //obteniendo la cantidad de apps que habran por pantallas
				
		ArrayList<Integer> anya = new ArrayList<Integer>();
		
		Map<Integer, Integer> nombreMap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<aplicaciones;i++){
			int apps=entrada.nextInt();
			anya.add(i,apps);//guardando el orden de las aplicaiones en el arraylist
			nombreMap.put(apps,i);
		}
		
		
		
		
		
		for(int i=0;i<applanzadas;i++){
			 app=entrada.nextInt();
			 
			 acciones += (int) nombreMap.get(app) / apppantalla;
	         acciones++;
	         
			 
			 if(nombreMap.get(app) > 0){//ordenando las posiciones de las aplicaiones
					int aux = nombreMap.get(app);
					
		            anya.set(aux, anya.get(aux - 1));
		            anya.set(aux - 1, app);
		            
		            nombreMap.put(app, aux - 1);
		            nombreMap.put(anya.get(aux), aux);
				}
			
			
		}
		System.out.println(acciones);
		
		
		
		
		
		}
	}


