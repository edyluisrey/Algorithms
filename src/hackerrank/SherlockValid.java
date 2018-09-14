package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SherlockValid {
	public static void main(String[] args){		
	  System.out.println(isValid("abcdefghhgfedecba"));	
		
	} 
	
	// Complete the isValid function below.
    static String isValid(String s) {
        String r = "YES";
        int max=0;
        int f=0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(char c: s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);            
        }
        for(Character key : map1.keySet()){
            map2.put(map1.get(key), map2.getOrDefault(map1.get(key),0)+1);
        } 
        
        for(Integer key: map2.keySet()){
            if(max<map2.get(key)){
                max= map2.get(key);
                f= key;
            }               
        }
        max=0;
        System.out.println("fre:"+f);
        for(Character key : map1.keySet()){
            if(map1.get(key)!=f)
             max+= map1.get(key);   
        }
        if(max>1 && Math.abs(max-f)!=1) r="NO";
        
        return r;
    }
    
}
