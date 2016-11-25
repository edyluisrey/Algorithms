package uva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prerequisites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k,category,c,r;
		String temp,cCourse;
		boolean getDegree;
		while ((k=in.nextInt())!=0) {
	        category = in.nextInt();	 
	        Map<String,Integer> fCourses= new HashMap();
	        getDegree=true; 
	        for ( int i = 0; i < k; i++) {
	        	temp=in.next(); 
	        	fCourses.put(temp, 1);
	        }
	 	 
	        for ( int i = 0; i < category; i++ ) {
                c= in.nextInt();
                r= in.nextInt();
	            for ( int j = 0; j < c; j++ ) {
	            	cCourse = in.next();
	            	if(fCourses.get(cCourse)!=null)
	            		r--;
	            }
	            if ( r > 0 ) 
	            	getDegree = false;
	        }
	 
	        if ( getDegree ) 
	        	System.out.println("yes");
	        else 
	        	System.out.println("no");
	    }
	 
	}

}
