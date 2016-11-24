package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ZerosOnes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n, a, b, temp,cont=1;
	    boolean same;
	    String s;
	    StringTokenizer t = null;
	    while ((s = in.readLine())!=null)
	    {   if(s.length()==0)
	    	break;
	        n=Integer.parseInt(in.readLine());	 
	        System.out.printf("Case %d:%n",cont);  
	        for(int j=0;j<n;j++)  
	        {   t= new StringTokenizer(in.readLine());            
	        	a=Integer.parseInt(t.nextToken());
	            b=Integer.parseInt(t.nextToken());
	            same=true;
	            if(b!=a){	            		
	            	if (b < a)
		            {
		                temp = a;
		                a = b;
		                b = temp;
		            } 

	            	for (int i = a; i <=b; ++i){
	            		if(s.charAt(i)!=s.charAt(b)){
	            		    same= false;
	            		    break;
	            		}
	            		
	            	} 
	            }	         
	            if (same)
	                System.out.println("Yes");
	            else
	            	System.out.println("No");
	            
	        }
	        cont++; 
	    }
	

	}

}
