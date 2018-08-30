package hackerrank;

import java.util.HashMap;
import java.util.List;

public class CountTriplets {
	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
	  int re = 0;  
	  HashMap<Long, Integer> map1 = new HashMap<>();
	  HashMap<Long, Integer> map2 = new HashMap<>();  
	  for(int i= 0; i < arr.size(); i++){
	      Long n= arr.get(i);
	      if(n%r==0){
	          Integer prev1 = map1.get(n/r); System.out.println("prv1:"+prev1);
	          if(prev1!=null){ 
	              map2.put(n, map2.getOrDefault(n,0)+ prev1);
	          }
	          Integer prev2= map2.get(n/r);  System.out.println("prv2:"+prev2);
	          if(prev2!=null){
	              re+=prev2;
	          }
	      }
	      map1.put(n, map1.getOrDefault(n,0)+1);   
	  }
	  return re;  
	}
}
