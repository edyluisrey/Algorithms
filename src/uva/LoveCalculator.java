package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveCalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		String name1,name2;
	    int sum1,sum2;
	    
	    while((name1= in.readLine())!=null){
	    	if(name1.length()==0) break;
	        name2= in.readLine(); 
	        
	        sum1=sum2=0;	        
	        for(int i=0;i<name1.length();i++){
	            if(Character.isLowerCase(name1.charAt(i))) sum1+=name1.charAt(i)-'a'+1;
	            else if(Character.isUpperCase(name1.charAt(i))) sum1+=name1.charAt(i)-'A'+1;
	        }
	        
	        if(sum1%9==0) sum1=9;
	        else sum1%=9;
	        
	        for(int i=0;i<name2.length();i++){
	            if(Character.isLowerCase(name2.charAt(i))) sum2+=name2.charAt(i)-'a'+1;
	            else if(Character.isUpperCase(name2.charAt(i))) sum2+=name2.charAt(i)-'A'+1;
	        }

	        if(sum2%9==0) sum2=9;
	        else sum2%=9;
	        
	        if(sum1>=sum2) 
	        	System.out.printf("%.2f %c%n",sum2*100.0/sum1,'%');
	        else 
	        	System.out.printf("%.2f %c%n",sum1*100.0/sum2,'%');
	        
	    }
	}

}
