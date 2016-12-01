package hackerrank;

import java.util.Scanner;

public class BestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=0,sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){   
                if(i<10){
                    if(max<i)
                        max=i;
                }else{  
                    sum=total(i);                    
                    if(max<sum)
                        max=i;
                }
            }
        }
        System.out.println(max);
	}
	
	static int total(int n){
        int total = 0;
        while(n > 1)
        {   
        	if(n>=10){
        		total+=n%10;
                n=n/10; 	
        	}else{
        		total+=n;
        		n=0;
        	}      
        }
        return total;
	}

}
