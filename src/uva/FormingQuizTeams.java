package uva;

import java.io.InputStreamReader;
import java.util.Scanner;

/*10911 - Forming Quiz Teams*/

public class FormingQuizTeams {   // Main

	public static void main(String[] args) {
		Scanner in= new Scanner(new InputStreamReader(System.in));
        while(true){
        	int n = in.nextInt();
        	if(n==0)
        		break;
			String[] names= new String[16];
	        int[] x= new int[16];
	        int[] y= new int[16];        
			if(n<=8){
				for(int i=0;i<n;i++){
					names[i]= in.next();
					x[i]=in.nextInt();
					y[i]=in.nextInt();
					System.out.println(names[i]+" " + x[i]+ " "+y[i]);
				}
				
			}
        }
				    
	}

}
