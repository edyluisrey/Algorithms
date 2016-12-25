package uva;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont=1,n,copy,numcopys;
		while(true){
			n=in.nextInt();
			if(n<=0) break;
			copy=1;
			numcopys=0;
			while(copy<n){
				copy=copy*2;
				numcopys++;
			}
			System.out.printf("Case %d: %d%n",cont,numcopys);
			cont++;
		}

	}

}