package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brainfuck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		int  t,count=1; 		
        String line; 
	    t= Integer.parseInt(in.readLine());
	    while((t--)!=0)
	    {  
	        line = in.readLine();
	        int pointer=0;
	        int[] mem= new int[100];
	        for(int i=0;i<line.length();i++)
	        {   
	            if(line.charAt(i)=='>'){ 
	            	pointer=(pointer+1)%100;
	                continue;
	            }   
	            else if(line.charAt(i)=='<') {
	            	pointer=(pointer-1+100)%100;
	            	 continue;
	            }	 
	            else if(line.charAt(i)=='+'){
	            	mem[pointer]=(mem[pointer]+1)%256;
	                continue;
	            }  
	            else if(line.charAt(i)=='-') 
	            	mem[pointer]=(mem[pointer]-1+256)%256;
	        }
	        System.out.printf("Case %d:",count);
	        for(int i=0;i<100;i++)
	        	System.out.printf(" %02X", mem[i]);
	        System.out.println();
	        count++;
	   }
	}	    

}
