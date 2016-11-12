package uva;

import java.util.Scanner;
/*Searching for Nessy*/
public class SearchingNessy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,a,b;
		n= in.nextInt();
		while(n>0){
			n--;
			a= in.nextInt();
			b= in.nextInt();
			System.out.println((int)(Math.floor((a)/3)*Math.floor((b)/3)));
		}
        in.close();
	}

}
