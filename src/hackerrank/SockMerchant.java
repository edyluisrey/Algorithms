package hackerrank;

import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
		   int s,t=0,n = in.nextInt();
		   int c[] = new int[n];
		   int temp[] = new int[n];
		   for(int c_i=0; c_i < n; c_i++){
		       c[c_i] = in.nextInt();
		   }
		   for(int i=0;i<n;i++){
		       s=0;
		       for(int j=0;j<n;j++){
		         boolean b=true;
		         for(int k=0;k<n;k++){
		        	 if(c[i]==temp[k]){
		        		 b=false;
		        		 break;
		        	 }
		         }
		    	 if(c[i]==c[j] && b)
		             s++;	             
		       }   
		       temp[i]=c[i];
		       t+=s/2;
		   }
		   System.out.println(t);
	}

}
