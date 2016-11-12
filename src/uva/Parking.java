package uva;

import java.util.Scanner;

public class Parking {
	 public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n, s, pos,min,max;
	   n= in.nextInt();
	   while((n--)!=0){
		   s=in.nextInt();
		   min=100;max=0;
		   while((s--)!=0){
			   pos= in.nextInt();
			   if(pos>max)
				   max =pos;
			   if(pos<min)
				   min=pos;
		   }
		   System.out.println(2*(max-min));
		   
	   }
	 }

}
