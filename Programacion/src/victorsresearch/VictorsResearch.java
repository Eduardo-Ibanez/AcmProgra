package victorsresearch;

import java.util.HashMap;
import java.util.Scanner;

public class VictorsResearch {

	

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int victor=entrada.nextInt();
		int ayudante=entrada.nextInt();
		int cont=0; int temp=0;int sumatoria=0;
		
		HashMap<Integer, Integer> consultar = new HashMap<Integer,Integer>();

		for(int i=1;i<=victor;i++){
			
			temp=entrada.nextInt();
			sumatoria+=temp;
		
			Integer valorbuscar = sumatoria - ayudante;
			Integer valorFrecuencia = consultar.get(valorbuscar);
			if(valorFrecuencia!=null){
				cont = cont + valorFrecuencia;
			}
			Integer frecuencia = consultar.get(sumatoria);
			if(frecuencia==null)
				frecuencia=1;
			else
				frecuencia++;
		
			consultar.put(sumatoria, frecuencia);
			
			if(sumatoria==ayudante){
				cont++;
			}
		}
		System.out.println(cont);
	}

}