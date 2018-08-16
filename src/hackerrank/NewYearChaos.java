package hackerrank;

public class NewYearChaos {
	
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
	    int n = q.length;
	    if(n==0) System.out.println(""+0);
	    int re = 0;
	    int k =0;
	    boolean failed = false;
	    for(int i= 0; i<n-1 ; i++){ 
	        if(failed) break;                       
	        if((i+1)!=q[i] && q[i]> q[i+1]){
	            k=i+2; re++;  
	            while(k<n && q[i]> q[k]){
	                if((k-i)> 2) {
	                    failed = true;
	                    System.out.println("Too chaotic");
	                    break;
	                }   
	                k++; re++;
	            }
	        } 
	    }
	    if(!failed)
	      System.out.println(""+re);
	    
	}
}
