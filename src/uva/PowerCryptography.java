package uva;

import java.util.Scanner;

public class PowerCryptography {
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()){
			double n=in.nextDouble();
			double p=in.nextDouble();
			double result=Math.round(Math.pow(p,1/n ));
			System.out.printf("%d%n",(int)result );
		}
 
	}

}
