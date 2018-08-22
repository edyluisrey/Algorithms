package hackerrank;

public class NewYearChaos {
	
	 // Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
	    int n = q.length;
	    if(n==0) System.out.println(""+0);
	    int re = 0;
	    boolean failed = false;
	    for(int i= 0; i< n ; i++){
	        if(q[i]-(i+1)>2){
	            failed = true;
	            break;
	        } 
	        for (int j = Math.max(0, q[i] - 2); j < i; j++)
	         if (q[j] > q[i]) re++;
	    }            
	    if(!failed)
	      System.out.println(""+re);
	    else
	      System.out.println("Too chaotic");  
	    
	}
}
