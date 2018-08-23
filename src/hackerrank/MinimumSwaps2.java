package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwaps2 {
	
	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
	   int n = arr.length;
	   if(n<2) return 0;
	   int re =0; 
	   int [] order = Arrays.copyOf(arr, arr.length);
	   boolean[] visited = new boolean[n]; 
	   mergeSort(order,0,n-1);
	   Map<Integer, Integer> map = new HashMap<>();
	   for(int i =0; i<n; i++){
	     map.put(order[i], i);   
	   } 
	    
	   for(int i =0; i< n; i++){
	       if (visited[i] || arr[i] == order[i])
	            continue;
	       else{  
	           int nodes=0;
	           int j=i;
	           while(!visited[j]){ 
	               visited[j]= true;
	               j= map.get(arr[j]);
	               nodes++;
	           }
	           re+=(nodes-1);
	       }           
	   } 
	   return re;
	    
	}
	
	static void mergeSort(int[] nums, int l, int p){
	    if(l==p){
	        return;
	    }
	    int mid = (l+p)/2;
	    mergeSort(nums, l, mid);
	    mergeSort(nums, mid+1, p);
	    merge(nums, l, mid+1, p);
	}
	
	static void merge(int[] nums, int left, int mid, int rightEnd){
	    int right = mid;  
	    int k=0;
	    int n= rightEnd-left+1;
	    int lower =left;
	    int[] temp= new int[n]; 
	    while(left<=mid-1 &&  right<= rightEnd){
	        if(nums[left]<=nums[right]){
	            temp[k++]= nums[left++];
	        }else{
	            temp[k++]= nums[right++];
	        }
	    } 
	    while(left<=mid-1){
	        temp[k++]= nums[left++];
	    }
	    while(right<=rightEnd){
	        temp[k++]= nums[right++];
	    }
	    
	    for(int i=0; i<n;i++){
	        nums[lower+i] = temp[i];
	    }
	    
	}

}
