package uva;

import java.util.Scanner;

public class TheSnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);			
		int H, D, F, day;
		float U, height, fatigue;
		while(true)
		{
			H= in.nextInt();
			if(H == 0) 
				break;
			U=in.nextInt();
			D=in.nextInt();
			F=in.nextInt();		
			day = 1;		
			height = 0;
			fatigue = U*F/100;
			while(true){	
				height += U;
				if(U > 0)
					U=U-fatigue;
				if(height > H){
					System.out.printf("success on day %d%n",day);
					break;
				} 		
				height=height-D;			
				if(height < 0){
					System.out.printf("failure on day %d%n",day);
					break;
				} 
							
				day++;
			}
		} 	

	}

}
