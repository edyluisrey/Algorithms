package uva;

import java.util.Scanner;

public class BlowingFuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int nd,no,c,currentCons,max,temp,ccase = 1;     
         boolean blown;
         nd=in.nextInt();         
         while (nd != 0) {                
              currentCons = 0;max=0;    
              no = in.nextInt();  
              c = in.nextInt();   
              blown = false;
              boolean[] states=new boolean[nd];  
              int[] devConsump= new int[nd]; 
              for(int i = 0; i < nd; i++) {  
                   devConsump[i] = in.nextInt();  
                   states[i] = false;  
              }  
               
              for(int i = 0; i < no; i++) {  
                   temp = in.nextInt();  
                   if(!states[temp-1]) {    
                        states[temp-1] = true;  
                        currentCons += devConsump[temp-1];  
                        if(currentCons > c) 
                             blown = true;  
                        if(currentCons > max) 
                        	max = currentCons;  
                   } else {   
                        currentCons -= devConsump[temp-1];  
                        states[temp-1] = false;  
                   }  
              }  
              System.out.println("Sequence " + ccase); 
              if(blown)   
            	  System.out.println("Fuse was blown.\n");  
              else{
            	  System.out.println("Fuse was not blown.");  
                  System.out.println("Maximal power consumption was " + max + " amperes.\n"); 
              }
            	  
              nd = in.nextInt();  
              ccase++;  
         }  
	}
}
