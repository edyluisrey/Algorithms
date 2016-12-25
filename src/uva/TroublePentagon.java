package uva;

import java.util.Scanner;

public class TroublePentagon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double factor= Math.sin(108*Math.PI/180)/Math.sin(63*Math.PI/180);  
		while(in.hasNext()){ 
	       double v= Double.parseDouble(in.next())*factor;
	       System.out.printf("%.10f%n",v);	      
		}

	}

}
