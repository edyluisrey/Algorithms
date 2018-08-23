package hackerrank;

public class MinimumSwaps2 {
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
       int n = arr.length;
       if(n<2) return 0;
       int re =0; 
       for(int i =0; i< n; i++){
           if((arr[i])==i+1) continue;
           else{
               int j= i;
               while(j<n && arr[j]!=(i+1)){
                   j++; 
               }
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               re++;               
           }
       } 
       return re;
    }

}
