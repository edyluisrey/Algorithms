package uva;

import java.util.Scanner;

public class GoogleFeelingLucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in= new Scanner(System.in);		
		    int t,max,c=1;
		    t=in.nextInt();
		   
		    while(c<=t){
		    	String [] site=new String [10];
		 		int [] rating=new int [10];
		    	max=-1;
		    	for(int i=0;i<10;i++){
		    		site[i]= in.next();
		    		rating[i]=in.nextInt();   
		    		if(max<rating[i])
		    			max=rating[i];
		    	}
		    	System.out.printf("Case #%d:%n",c);
			for (int i=0;i<10;i++) {
				if (rating[i]==max) {
					System.out.println(site[i]);				
				}
			}
			c++;
		}

	}

}
