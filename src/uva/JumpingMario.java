package uva;

import java.util.Scanner;

public class JumpingMario {
  
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int t,n,hj,lj,i,current,newWall;
	   t= in.nextInt();
	   i=1;
	   while(i<=t){
		   n=in.nextInt();
		   current= in.nextInt();
		   hj=0;
		   lj=0;
		   for(int j=0;j<n-1;j++){
			   newWall= in.nextInt();
			   if(current<newWall)
				   hj++;
			   if(current>newWall)
				   lj++;
			   current= newWall;
		   }
		   System.out.println("Case " + i +": " + hj + " " + lj);  		   
		   i++;	   
	   }
   }
}
