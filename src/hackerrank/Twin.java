package hackerrank;

import java.util.Scanner;


public class Twin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int count=0;
        for(int i=n; i<=m;i++){        	
        	for(int j=i+1;j<=i+2;j++){  
        		if(!(j<=m)) break;
        		int ci=0;
        		for(int p=1;p<=i;p++){
        			if(i%p==0) ci++;
        		}
        		if(ci==2){    
	        		if(Math.abs(j-i)==2 || i!=1){   
		        		int  cj=0;		        		
		        		for(int jp=1;jp*jp<=j;jp++){
		        			if(j%jp==0) cj++;
		        		}		        		
		        		if(cj==2)  
		        			count++; 
	        		}
        		}
        	}
        }
        System.out.println(count);
	}

}





