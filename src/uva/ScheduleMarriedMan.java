package uva;

import java.util.Scanner;

public class ScheduleMarriedMan {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t= Integer.parseInt(in.nextLine());
		int h1,m1,h2,m2,h3,m3,h4,m4,a,b,c,d,i=1;
		String str1,str2;
		String[] astr1,astr2;
		while((t--)!=0){
			str1= in.nextLine();
			str2=in.nextLine();
			astr1= str1.split(" ");
			astr2= str2.split(" ");   
			h1=Integer.parseInt(astr1[0].substring(0, 2));
			h2=Integer.parseInt(astr1[1].substring(0, 2));
			m1=Integer.parseInt(astr1[0].substring(3, 5));
			m2=Integer.parseInt(astr1[1].substring(3, 5));
			h3=Integer.parseInt(astr2[0].substring(0, 2));
			h4=Integer.parseInt(astr2[1].substring(0, 2));
			m3=Integer.parseInt(astr2[0].substring(3, 5));
			m4=Integer.parseInt(astr2[1].substring(3, 5));
			
			a=(h1*60)+m1;
			b=(h2*60)+m2;
			c=(h3*60)+m3;
			d=(h4*60)+m4;
			if(a>d || c>b)
				System.out.printf("Case %d: Hits Meeting\n",i);
			else
				System.out.printf("Case %d: Mrs Meeting\n",i);	
			i++;

		}

	}

}
