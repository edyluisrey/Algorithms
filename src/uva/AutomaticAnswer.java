package uva;

import java.util.Scanner;
/*Automatic Answer*/
public class AutomaticAnswer {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, total,n,d;
		t=in.nextInt();
		while((t--)!=0){
			n= in.nextInt();
			total=(((((n*567)/9)+7492)*235)/47)-498;
			d= total/10;
			System.out.println(Math.abs(d%10));
		}
		
	}
}
