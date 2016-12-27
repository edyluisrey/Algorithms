package uva;

import java.util.Scanner;

public class BoxBricks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int avr,moves,n,totalBricks,count=1;
		int[] a;
		while(true){
			n=in.nextInt();
			if(n<=0) break;
			a=new int[n];
			moves=0;
			totalBricks=0;
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
				totalBricks+= a[i];
			}
			avr=totalBricks/n;
			for(int i=0;i<n;i++){
				if(a[i]>avr)
					moves=moves+(a[i]-avr);					
			}
			System.out.println("Set #"+count);
			System.out.printf("The minimum number of moves is %d.%n%n",moves);
			count++;
		}

	}

}