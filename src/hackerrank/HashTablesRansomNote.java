package hackerrank;

import java.util.HashMap;

public class HashTablesRansomNote {
	
	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
	   HashMap<String, Integer>  map = new HashMap<>();
	   boolean re= true;  
	   for(String s: magazine){
	        if(map.containsKey(s)){ 
	            map.put(s,map.get(s)+1);
	        }else{
	            map.put(s,1);
	        }
	    }
	    for(String s: note){
	        if(map.containsKey(s) && map.get(s)>0){
	            map.put(s, map.get(s)-1);
	        }else{  
	            re= false;
	            break;
	        }                
	    }
	    if(re) System.out.println("Yes");
	    else System.out.println("No");
	
	}
}
