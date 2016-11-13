package uva;

import java.util.Scanner;

public class SummingDigits {

	public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n, s;
        while((n=in.nextInt())!=0){
        	s= sum(n);
        	System.out.println(s);
        }
	}
	static int sum(int n){		
		int sum = 0;
		for(int i=n;i!=0;i=i/10){
			sum = sum +i%10;
		}
		if(sum<10)
			return sum;
		else 
			return sum(sum);	
	}

}
