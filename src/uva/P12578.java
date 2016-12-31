package uva;

import java.util.Scanner;

public class P12578 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		double l,area,green;
		while((t--)!=0){
			l= in.nextDouble();
			area= Math.PI*(l/5)*(l/5);
			green=l*l*0.6-area;
			System.out.printf("%.2f %.2f%n",area,green);
		}

	}

}
