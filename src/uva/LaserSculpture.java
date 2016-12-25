package uva;

import java.util.Scanner;

public class LaserSculpture {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
		   int a, c, count;
		   while(true)
		   {   a=in.nextInt();  
		       if(a==0)
			     break;
		       c=in.nextInt();                    
		       int[] v =new int[c]; 
		       count = 0;   
		       for(int i=0; i<c; i++)
		       {  v[i]=in.nextInt();
		       }
		       count= a-v[0];
		       for(int i=1; i<v.length; i++)
		       {   
		    	   if(v[i]<v[i-1])
		    		   count= count+(v[i-1]-v[i]);        	   
		       }
		       System.out.println(count);
		   }   
	}

}
