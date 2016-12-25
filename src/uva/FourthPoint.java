package uva;

import java.util.Scanner;

public class FourthPoint {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double x1,y1,x2,y2,x3,y3,x4,y4,xp4,yp4;
       while(in.hasNext()){
    	   x1=Double.parseDouble(in.next());
    	   y1=Double.parseDouble(in.next());
    	   x2=Double.parseDouble(in.next());
    	   y2=Double.parseDouble(in.next());
    	   x3=Double.parseDouble(in.next());
    	   y3=Double.parseDouble(in.next());
    	   x4=Double.parseDouble(in.next());
    	   y4=Double.parseDouble(in.next());
    	   
    	   if(x1 == x3 && y1 == y3){
    		   xp4=(x2+x4)-x1;
    	       yp4=(y2+y4)-y1;
    	   }
    	   else if(x1 == x4 && y1 == y4){
    		   xp4=(x2+x3)-x1;
    		   yp4=(y2+y3)-y1;
    	   }
    	   else if(x2 == x3 && y2 == y3){
    		   xp4=(x1+x4)-x2;
    		   yp4=(y1+y4)-y2;
    	   }else{
    		   xp4= (x1+x3)-x2;
    		   yp4=(y1+y3)-y2;
    	   }
    	   System.out.printf("%.3f %.3f%n",xp4,yp4);
       }

	}

}
