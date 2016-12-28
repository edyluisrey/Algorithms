package uva;

import java.util.Scanner;

public class BeatSpread {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n,s,d,x,y;
			n=in.nextInt();
			while((n--)!=0){
				s=in.nextInt();
				d=in.nextInt();
				if(d>s || (s-d)%2!=0)
					System.out.println("impossible");
				else{
					y=(s-d)/2;
					x=y+d;
					System.out.printf("%d %d%n",x,y);
				}
			}

	}

}