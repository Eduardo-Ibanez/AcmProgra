package registrationsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RegistrationSystem {

	public static void main(String[] args) {
		
		//CODIGO APROBADO EN CODEFORCES
		
		int cont=0;
		String nombre="";
		
		Scanner entrada=new Scanner(System.in);
		int cantnombres=entrada.nextInt();

		Map<String, Integer> registro = new HashMap<String, Integer>();
		
		for(int i=0;i<cantnombres;i++){
			 nombre=entrada.next();
			if(nombre.length()<33){
				
			if(registro.containsKey(nombre) != true){
				registro.put(nombre, 1);
				System.out.println("OK");
			}
			else{
				
			
			System.out.println(nombre+""+registro.get(nombre));
			registro.put((nombre), registro.get(nombre)+1);
				
			}
			}
		}
			

	}

}
