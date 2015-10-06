package dominopiling;

import java.util.Scanner;

public class DominoPiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int n=entrada.nextInt();
		int m=entrada.nextInt();
						
		int maxdomino=((n*m)/2);
		System.out.println(maxdomino);
		
	}

}
