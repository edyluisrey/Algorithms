package uva;

import java.util.Scanner;

public class PrimaryArithmetic {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a,b,carry,times,sum;
		while(true){
			a=in.nextInt();
			b=in.nextInt();
			if(a==0 && b==0) break;
			carry=0;
			times=0;
			while(a>0 || b>0){
				sum= a%10+b%10+carry;
				if(sum>=10)
					times++;
				a=a/10;
				b=b/10;  
				carry=sum/10;				
			}
			
			if(times==0)
				System.out.println("No carry operation.");
			else if(times==1)
				System.out.printf("%d carry operation.%n",times);
			else
				System.out.printf("%d carry operations.%n",times);
			
		}

	}

}
