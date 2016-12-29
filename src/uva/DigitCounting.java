package uva;

import java.util.Scanner;

public class DigitCounting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t,n;
		t= in.nextInt();
		while((t--)!=0){
			n=in.nextInt();
			StringBuilder  str = new StringBuilder("");
			for(int i=0;i<n;i++){
				str.append(i+1);
			}   
			int[] result = new int[10];
			for(int j=0;j<str.length();j++){  
				 result[str.charAt(j) - '0']++;
			} 
			for(int k=0;k<10;k++){
				if(k>0)
					System.out.printf(" ");
			    System.out.printf("%d",result[k]);
			}
			System.out.println();
		}

	}

}
