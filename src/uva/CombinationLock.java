package uva;

import java.util.Scanner;

public class CombinationLock {
	
    public static void main(String[] args) {  
         Scanner scanner = new Scanner(System.in);           
         while(true) {  
        	  int n1,n2,n3,n4,total,degrees=360/40;
              n1 = scanner.nextInt();  
              n2 = scanner.nextInt();  
              n3 = scanner.nextInt();  
              n4 = scanner.nextInt();  
              if((n1 == 0) && (n2 == 0) && (n3 == 0) && (n4 == 0)) 
            	  break;
              total=120;  //40x3
              if (n2>n1) {
  				total+=40-n2+n1;
  			  } else {
  				total+=n1-n2;
  			  }
  			
  			  if (n3>n2) {
  				total+=(n3-n2);
  			  } else {
  				total+=40-n2+n3;
  			  }
  			
  			  if (n4>n3) {
  				total+=40-n4+n3;
  			  } else {
  				total+=n3-n4;
  			  }  
              
  			  System.out.println(total*degrees);  
         }  
         scanner.close();  
    }  

}
