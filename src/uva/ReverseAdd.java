package uva;

import java.util.Scanner;

public class ReverseAdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t,it;
		long n,rev;
		t= in.nextInt();
		while((t--)!=0){
			n=in.nextInt();
			it=0;
			rev=reverse(n);
			while(n!=rev){
			   	n=n+rev;
			   	rev=reverse(n);
			   	it++;
			   	
			}
			System.out.printf("%d %d%n",it,n);
		}

	}
	
	static long reverse(long n){
		long d, reverse=0;
		while(n>0){
			d=n%10;
			reverse=reverse*10+d;
			n=n/10;
		}
		return reverse;
	}

}
