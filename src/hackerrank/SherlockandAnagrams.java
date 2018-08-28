package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockandAnagrams {
	
	// Complete the sherlockAndAnagrams function below.
	static int sherlockAndAnagrams(String s) {
	    Map<String, Integer> map = new HashMap<>();
	    int n=0;
	    for(int i=0; i< s.length(); i++){
	       for(int j = i+1; j<=s.length(); j++){
	           char[] c= s.substring(i,j).toCharArray();
	           Arrays.sort(c);  
	           String str = String.valueOf(c); 
	           if(map.containsKey(str))
	               map.put(str, map.get(str)+ 1);
	           else
	               map.put(str,1);
	       }  
	    }
	    for(String key: map.keySet()){            
	        n += (map.get(key)*(map.get(key)-1))/2; 
	    }
	    return n;
	}
    
}
