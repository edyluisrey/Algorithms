package uva;

import java.util.Scanner;

public class Bafana {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int n,k,p,position,cas=1;
	     int t= in.nextInt();
	     while((t--)!=0){
	    	 n=in.nextInt();
	    	 k=in.nextInt();
	    	 p=in.nextInt();
	    	 position= (((k-1)+p)%n)+1;
	    	 System.out.printf("Case %d: %d%n",cas++,position);
	     }

	}

}
