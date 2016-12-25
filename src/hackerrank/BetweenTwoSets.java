package hackerrank;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 int m = in.nextInt();
		 int[] a = new int[n];
		 for(int a_i=0; a_i < n; a_i++){
		     a[a_i] = in.nextInt();
		 }
		 int[] b = new int[m];
		 for(int b_i=0; b_i < m; b_i++){
		     b[b_i] = in.nextInt();
		 }
		 int cont=0;         
		 for(int i= 1; i<=100;i++){   
			 boolean ind=true;
		     for(int ai=0;ai<n;ai++)  // A is factor x
		 {   
		     if(i%a[ai]!=0){
		         ind=false;
		         break;
		     }
		         
		 }
		 if(ind){
		   for(int bi=0;bi<m;bi++) //x is factor of B 
		       {
		           if(b[bi]%i!=0){
		             ind=false;
		             break;
		         }
		               
		       }    
		     }
		     if(ind)
		         cont++;
		 }
		 System.out.println(cont);
	}

}
