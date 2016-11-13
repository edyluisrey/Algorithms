package uva;

import java.util.Scanner;

public class SecretResearch {

	public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n= Integer.parseInt(in.next());
         String s;
         while((n--)!=0){
        	 s=in.next();
        	 if(s.equals("1") || s.equals("4") || s.equals("78"))  System.out.println("+");
        	 else if(s.endsWith("35")) System.out.println("-");  
             else if(s.startsWith("9") && s.endsWith("4")) System.out.println("*");  
             else if(s.startsWith("190")) System.out.println("?"); 
         }
	}

}
