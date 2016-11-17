package uva;

import java.util.Scanner;

public class RobotInstructions {

	public static void main(String[] args) { 
		   Scanner in = new Scanner(System.in);	
		   int n,cont;
		   String cp;
		   int t = in.nextInt();  
		   while((t--)!= 0) {  		          
		        cont = 0; 
		        n = in.nextInt();
		        int[] instructions = new int[n];  
		        for(int i = 0; i < n; i++) {  
		             cp = in.next();  
		             if(cp.startsWith("L")) {  
		            	 instructions[i] = -1;  
		            	 cont--;  
		             } else if(cp.startsWith("R")) {  
		                  instructions[i] = 1;  
		                  cont++;  
		             } else {  
		                  in.next();  
		                  int tmp = in.nextInt();  
		                  instructions[i] = instructions[tmp-1];  
		                  if(instructions[i] == -1) 
		                	  cont--;  
		                  else 
		                	  cont++;  
		             }  
		        }  
		        System.out.println(cont);                 
		   } 
	}

}
