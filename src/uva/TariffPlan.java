package uva;

import java.util.Scanner;

public class TariffPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int t, n,v, mCost, jCost,i=1;
		t=in.nextInt();    
	    while (i<=t)
		{
		    n=in.nextInt();    	    	
	        mCost =0; 
	        jCost = 0;
	        while ((n--)!=0)
	        {   v=in.nextInt();
	            mCost += (v / 30) * 10 + 10;
	            jCost += (v / 60) * 15 + 15;
	        }
	        if(mCost < jCost) {  
                System.out.println("Case " + i + ": Mile " + mCost);  
            } else if(mCost > jCost) {  
                System.out.println("Case " + i + ": Juice " + jCost);  
            } else      {  
                System.out.println("Case " + i + ": Mile Juice "+ mCost);  
            }  
           i++;
		}
	}

}
