package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RequestProposal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		int n, p, r,cont=1;
		String namepr, bname="",line;
		double d, bestCompliance, price;
		StringTokenizer st = null;
		 	
		while((line = in.readLine()) != null) {
			st = new StringTokenizer(line);
			n=Integer.parseInt(st.nextToken());
			p=Integer.parseInt(st.nextToken());			
	        if(n == 0 && p == 0) 
	        	break;
	        for(int i = 0; i < n; i++)
	            in.readLine();
	        
	        bestCompliance = 0.0;
	        price = 2000000000;
	        for(int i = 0; i < p; i++) {
	            namepr=in.readLine(); 
	            st = new StringTokenizer(in.readLine());
	            d= Double.parseDouble(st.nextToken());
	            r=Integer.parseInt(st.nextToken());
	            for(int j = 0; j < r; j++)
	                  in.readLine();
	            if((float) r / p >bestCompliance || (float) r / p == bestCompliance && d < price) {
	                bestCompliance = (float) r / p;
	                price = d;
	                bname = namepr;
	            }
	        }
	        if(cont > 1)
				  System.out.println();
	        System.out.println("RFP #"+cont);
	        System.out.println(bname);	      
	        cont++;
	    }
	}

}
