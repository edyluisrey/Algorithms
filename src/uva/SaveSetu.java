package uva;

import java.util.Scanner;

public class SaveSetu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);  
         int t = Integer.parseInt(in.nextLine());
         int total=0;
         String l;
         while((t--)!=0) {  
               l= in.nextLine();   
               if(l.charAt(0)=='d'){
            	   String[] str= l.split(" ");
            	   total+=Integer.parseInt(str[1]);
               }else
                  System.out.println(total);
          
         }  
	}

}
