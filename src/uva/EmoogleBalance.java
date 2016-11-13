package uva;

/*import java.util.Scanner;

public class EmoogleBalance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value, balan, t,i=0;
		t= in.nextInt();
		while(t!=0){
			balan=0;
			i++;
			while((t--)!=0){
				value=in.nextInt();
				if(value==0)
					balan--;
				else
					balan++;
			}
			System.out.printf("Case %d: %d%n",i,balan);
			t= in.nextInt();
		}

	}

}  */


import java.util.Scanner;

public class EmoogleBalance {  
     public static void main(String[] args) {  
    	 Scanner in = new Scanner(System.in);
    	 String l;
    	 int i=1;
         while(!((l=in.nextLine()).equals("*"))) {                
               if(l.startsWith("H")){ 
            	   System.out.println("Case " + i++ + ": Hajj-e-Akbar");
               }else
            	   System.out.println("Case " + i++ + ": Hajj-e-Asghar");  
          
         }  
          
     }  
}  
