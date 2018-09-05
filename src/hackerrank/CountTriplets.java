package hackerrank;

import java.util.HashMap;
import java.util.List;

public class CountTriplets {
	
	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
	  int re = 0;  
	  HashMap<Long, Integer> map1 = new HashMap<>();
	  HashMap<Long, Integer> map2 = new HashMap<>();  
	  for(int i =0; i< arr.size(); i++)
	      map1.put(arr.get(i), map1.getOrDefault(arr.get(i),0)+1);   
	    
	  for(int i= 0; i < arr.size(); i++){
	      Long n= arr.get(i);
	      if(n%r==0 && r!=1){
	          Integer left = map2.get(n/r);
	          Integer rest = map2.get(n*r);
	          Integer right= map1.get(n*r);
	          if(rest!= null && right!=null)
	              right= right - rest;
	          if(left!=null && right!=null)
	              re+= left* right;
	      }
	      map2.put(n, map2.getOrDefault(n,0)+1);     
	  } 
	  System.out.println(re);  
	  return re;  
	}
	
	public static void main(String[] args){
		
	}
}
