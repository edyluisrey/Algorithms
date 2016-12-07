package uva;

import java.util.Scanner;

public class The3n1problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);        
        while(in.hasNextInt()){
            int i = in.nextInt();
            int j = in.nextInt();            
            int from = Math.min(i, j);
            int to = Math.max(i, j);
            int max = 0;
 
             for(int k=from; k<=to; k++){
                    max = Math.max(max, processCycle(k));
             }
 
             System.out.println(i+" "+j+" "+max);
        }
	}
	
	static int processCycle(int n){
		    if(n == 1)
		    	return 1;
		    else{
		        int cnt = 1;
		        if(n%2!=0)
		        	return cnt += processCycle(3*n+1);
		        else 
		        	return cnt += processCycle(n/2);
		    }
	}

}
