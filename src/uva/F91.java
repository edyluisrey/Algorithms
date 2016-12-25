package uva;

import java.util.Scanner;

public class F91 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while((n = in.nextInt())!=0){
        	if(n<=100)
        	   System.out.printf("f91(%d) = 91\n",n);
        	else
        	   System.out.printf("f91(%d) = %d\n",n,n-10);
        }
	}

}
