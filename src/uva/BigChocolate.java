package uva;

import java.util.Scanner;

public class BigChocolate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n;
		while(in.hasNext()){
			m= in.nextInt();
			n=in.nextInt();
			System.out.println(m*n-1);
		}

	}

}
