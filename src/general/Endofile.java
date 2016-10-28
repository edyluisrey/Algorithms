package general;

import java.util.Scanner;

public class Endofile {
	
	public static void main(String[] args) {	        
	        Scanner sc= new Scanner(System.in);  
	        System.out.println("enter number:");
	        int num= sc.nextInt();
	        System.out.println(num);
	        int line=0;
	        System.out.println("Next:"+sc.hasNext());
	        while(sc.hasNext()){
	    	    line++;
	            System.out.println(line+ " "+ sc.nextLine());
	        }   
	}
}
