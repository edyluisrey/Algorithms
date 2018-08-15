package hackerrank;

public class ArraysLeftRotation {
	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
	    int n = a.length;
	    int mod = d%n;
	    int[] re = new int[n];
	    if(mod==0)
	        return a;
	    int j=0;
	    for(int i = mod; i< n; i++)
	        re[j++]= a[i];
	    for(int i = 0; i < mod; i++)
	        re[j++] = a[i];
	        
	    return re; 
	}
}
