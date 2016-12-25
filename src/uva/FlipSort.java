package uva;

import java.util.Scanner;

public class FlipSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		int n=in.nextInt(); 
		int a[] = new int[n]; 
		   for(int i=0;i<n;i++){
		   	a[i]=in.nextInt();
		   }
		int total=0;        	 
		for(int i=0;i<n;i++) {
		       for(int j=i+1;j<n;j++)
		            if(a[i]>a[j]) 
		           	 total++;
		  }
		  System.out.println("Minimum exchange operations : "+total);	
		}
	}

}
