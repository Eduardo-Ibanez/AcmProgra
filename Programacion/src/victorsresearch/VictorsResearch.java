package victorsresearch;

import java.util.Scanner;

import watermelon.FileManager;

public class VictorsResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int cont=0;
		
		
		
		Scanner entrada =new Scanner(System.in);
		
		int cientifico= entrada.nextInt();
		int ayudante= entrada.nextInt();
		int numeros[]= new int [cientifico];
		
	for(i=1;i<cientifico;i++){
		int entradas=entrada.nextInt();
		numeros[i]=entradas;	
		
		if(numeros[i]==ayudante){
			cont++;
		}
			if(numeros[i]==ayudante){
				cont++;
			}
			for(int j=1;j<=i;j++){
				numeros[i-j]+=numeros[i];
				if(numeros[i-j]==ayudante){
					cont++;
					
				}
			}
		}
	
	System.out.println(cont);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
