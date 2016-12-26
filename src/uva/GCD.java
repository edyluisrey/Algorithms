package uva;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,g;
		while(true){
			n=in.nextInt();
			if(n<=0) break;
			g=0;
			for(int i=1;i<n;i++){
			   for(int j=i+1;j<=n;j++){
			      g+=gcd(i,j);
			   }
			}   
			System.out.println(g);
		}

	}
	static int gcd(int i,int j){
		int temp;
		while(i!=0){
			temp=j%i;
			j=i;
			i=temp;
		}
		return j; 
	}

}