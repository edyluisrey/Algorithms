package hackerrank;

public class TwoDArrayDS {
	
	 // Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
	    int sum = -100;
	    for(int i = 0; i<= 3; i++){
	        for(int j = 0; j <=3 ; j++){
	            int subSum = 0;
	            int k =0;    
	            for(int m = i; m< i+3; m++){
	                for(int n= j ; n < j+3; n++){                        
	                    if(k==1){
	                        if(n==j+1){
	                            subSum = subSum + arr[m][n];
	                        }
	                    }else{
	                        subSum = subSum+  arr[m][n];
	                    }
	                }
	                k++;
	            }                
	            if(sum< subSum)
	                sum = subSum;
	            System.out.println("i:"+i + " j:"+j +  " sum:"+ sum); 
	        }
	    }
	    return sum;
	
	}
}
