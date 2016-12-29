package uva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SMSTyping {

	public static void main(String[] args) {
         Scanner in = new  Scanner(System.in);
         int t, to,cont=1;
         t= Integer.parseInt(in.nextLine());
         Map<String,Integer> map= new HashMap<>();
         map.put("a", 1); map.put("b", 2); map.put("c", 3);
         map.put("d", 1); map.put("e", 2); map.put("f", 3);
         map.put("g", 1); map.put("h", 2); map.put("i", 3);
         map.put("j", 1); map.put("k", 2); map.put("l", 3);
         map.put("m", 1); map.put("n", 2); map.put("o", 3);
         map.put("p", 1); map.put("q", 2); map.put("r", 3); map.put("s", 4);
         map.put("t", 1); map.put("u", 2); map.put("v", 3);
         map.put("w", 1); map.put("x", 2); map.put("y", 3); map.put("z", 4);
         
         while(cont<=t){
        	 String s= in.nextLine();
        	 to=0;
        	 for(int i=0;i<s.length();i++){
        		 char c =s.charAt(i);  
        		 if(Character.isAlphabetic(c)){
        			 to+=map.get(String.valueOf(c));
        		 }else
        			 to++;
        	 }
        	 
        	 System.out.printf("Case #%d: %d%n",cont,to); 
        	 cont++;
         }

	}

}
