package identifyingtea;

import java.util.Scanner;

 class IdentifyingTea {

	public static void main(String[] args) {
		IdentifyingTea myWork = new IdentifyingTea();  // create a dinamic instance
        myWork.desarrollo();  

	}
	void desarrollo(){
		
		int numte;
		int resp;
		int cont=0;
		Scanner entrada=new Scanner(System.in);
		
		numte=entrada.nextInt();
		
		for(int i=0;i<5;i++){
			resp=entrada.nextInt();
			if(resp==numte){
				cont++;
			}
			
		}
		System.out.println(cont);
	}

}
