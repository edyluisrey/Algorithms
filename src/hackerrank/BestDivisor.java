package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BestDivisor {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int max=0,sum=0, maxi=0;
			for(int i=1;i<=n;i++){
			    if(n%i==0){   
			        if(i<10){
			            if(max<i){
			                max=i;
			                maxi=i;
			             }
			        }else{   
			            sum=sumDigit(i);    
			            if(max<sum){   
			            	max=sum;
			            	maxi=i;
			            }
			                
			        }
			    }
			}
			
			System.out.println(maxi);
	}
		
	public static int sumDigit(int digit)
	{    
		int sum=0;
		while(digit!=0)
		{
			sum=sum+(digit%10);
			digit=digit/10;  
		}   
		return sum;
	}

}
