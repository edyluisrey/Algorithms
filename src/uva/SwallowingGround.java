package uva;

import java.util.Scanner;

public class SwallowingGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int t,nc,x,y,gap;
		boolean temp;
        t = in.nextInt();   
        while((t--) > 0) {  
             nc= in.nextInt();  
             x = in.nextInt();  
             y = in.nextInt();  
             gap = Math.abs(x - y);    
             temp = true;  
             while((nc--) > 1) {  
                  x = in.nextInt();  
                  y = in.nextInt();   
                  if(Math.abs(x - y) != gap)  
                       temp = false;   
             }  
             if(temp) 
            	System.out.println("yes");  
             else 
            	System.out.println("no");  
             if(t != 0) 
            	System.out.println("");   
        }  

	}

}
