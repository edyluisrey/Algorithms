package uva;

import java.math.BigInteger;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger y;
		boolean first = true;
		while(in.hasNextBigInteger()){
			y=in.nextBigInteger();
			if (!first)
			    System.out.println();
			first = false;
			if((y.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO) && !y.mod(BigInteger.valueOf(100)).equals(BigInteger.ZERO))
					|| y.mod(BigInteger.valueOf(400)).equals(BigInteger.ZERO)){
					System.out.println("This is leap year.");
					if(y.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO))
						System.out.println("This is huluculu festival year.");
					if(y.mod(BigInteger.valueOf(55)).equals(BigInteger.ZERO))
						System.out.println("This is bulukulu festival year.");
			}else if(y.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)){
				System.out.println("This is huluculu festival year.");
			}
			else 
				System.out.println("This is an ordinary year.");
		}

	}

}