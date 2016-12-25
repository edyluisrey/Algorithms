package uva;

import java.util.Scanner;

public class TrainSwapping {

	public static void main(String[] args) {	
	    Scanner in = new Scanner(System.in);
	    int t= in.nextInt();
	    while((t--)!=0){
	    	int n= in.nextInt();
	    	int[] a= new int[n];
	    	for(int i=0;i<n;i++)
	    		a[i]=in.nextInt();
	    	int total=0;
	    	for(int i=0; i<n; i++){
	    		for(int j=i+1;j<n;j++ ){
	    			if(a[i]>a[j]) total++;
	    		}
	    	}
	    	System.out.printf("Optimal train swapping takes %d swaps.%n",total);
	    		
	    }
	}

}
