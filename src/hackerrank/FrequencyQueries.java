package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {
   
	// Complete the freqQuery function below.
	static List<Integer> freqQuery(List<List<Integer>> queries) {
	   Map<Integer, Integer> map = new HashMap<>();;
	   List<Integer> list = new ArrayList<>();
	   for(int i = 0; i< queries.size(); i++){
	       int v = queries.get(i).get(1);
	       if(queries.get(i).get(0)==1){
	         map.put(v, map.getOrDefault(v,0)+1);    
	       }
	       if(queries.get(i).get(0)==2 && map.get(v)!=null){
	          if(map.get(v)<=1)
	              map.remove(v);
	          else
	            map.put(v, map.get(v)-1);
	       }
	       if(queries.get(i).get(0)==3){
	         if(map.containsValue(v))
	             list.add(1);
	         else
	             list.add(0);
	       }
	   } 
	   return list;
	}
}
