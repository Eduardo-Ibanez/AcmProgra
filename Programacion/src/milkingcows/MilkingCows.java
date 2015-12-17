package milkingcows;

import java.util.Scanner;

public class MilkingCows {

	public static void main(String[] args) {
		
		int x[]=new int[200200];
		int zero []=new int[200200];
		long  res=0;
		int n;
		Scanner entrada = new Scanner(System.in);
		n=entrada.nextInt();
		for(int i=1;i<=n;++i){
			x[i]=entrada.nextInt();			
		}
		for(int i=n;i>=1;--i){
			zero[i]=zero[i+1] + 1 - x[i];			
		}
		for(int i=1;i<=n;++i){
			if(x[i]==1){
				res+=zero[i];
			}
		}
		System.out.println(res);
	}

}
