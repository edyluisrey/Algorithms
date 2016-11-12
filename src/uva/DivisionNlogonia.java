package uva;

import java.util.Scanner;

/*Division of Nlogonia*/
public class DivisionNlogonia {

	public static void main(String[] args) {
	    int t, mx,ny,px,py;
	    Scanner in = new Scanner(System.in);
	    t=in.nextInt();
	    while(t!=0){
	    	mx= in.nextInt();
		    ny=in.nextInt();
		    while(t>0){
		    	t--;
		    	px= in.nextInt();
		    	py=in.nextInt();
		    	if(px==mx){
		    		System.out.println("divisa");
		    		continue;}
		    	if(py==ny){
		    		System.out.println("divisa");
		    	    continue;}
		    	if(px>mx){
		    		if(py>ny)
		    			System.out.println("NE");
		    		else
		    			System.out.println("SE");
		    		continue;
		    		
		    	}
		    	if(py>ny)
		    		System.out.println("NO");
		    	else
		    		System.out.println("SO");		    	
		    	
		    }
	    }
	    in.close();

	}

}
