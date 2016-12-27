package uva;

import java.util.Scanner;

public class ClockHands {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		double  h,m,hAngle,mAngle,diff; 
		while(true){
			s=in.next();
			String[] a=s.split(":");
			h=Double.parseDouble(a[0]);
			m=Double.parseDouble(a[1]);
			if(h==0 && m==0) break;
			h=h+m/60;
			hAngle= h*30;
			mAngle= m*6;
			diff=Math.abs(hAngle-mAngle);
			if(diff>180)
				diff=360-diff;
			System.out.printf("%.3f%n",diff);
		}

	}

}
