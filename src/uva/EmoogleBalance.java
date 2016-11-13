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
    	 int t, nf,s,d,a,sum;
    	 t=in.nextInt();
         while((t--)!=0) {
        	   sum=0;
        	   nf=in.nextInt();
               while((nf--)!=0){
            	   s=in.nextInt();
            	   a=in.nextInt();
            	   d=in.nextInt();
            	   sum= sum+s*d;
               }
               System.out.println(sum);
          
         }        
          
     }  
}  
