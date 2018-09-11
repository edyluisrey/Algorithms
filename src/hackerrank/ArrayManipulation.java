package hackerrank;

public class ArrayManipulation {
	
	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
	    if(queries.length==0 || n==0) return 0L;
	    int[] v = new int[n];
	    long re = 0L;
	    for(int i = 0; i<queries.length; i++){
	        v[queries[i][0]-1] = v[queries[i][0]-1]+queries[i][2];
	        if(queries[i][1]<n){
	            v[queries[i][1]] = v[queries[i][1]]-queries[i][2];
	        }
	    }
	    long sum = 0L;
	    for(int i = 0; i<n; i++){
	        sum +=v[i];
	        re = Math.max(sum,re);
	    }
	    return re;
	}
}
