package uva;

import java.util.Scanner;

public class Egypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		while(true){
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			if(a==0 && b==0 && c==0) break;
			if(a*a==b*b+c*c)
				System.out.println("right");
			else if(b*b==a*a+c*c)
				System.out.println("right");
			else if(c*c==b*b+a*a)
				System.out.println("right");
			else
				System.out.println("wrong");
		}

	}

}
