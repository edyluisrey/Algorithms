package uva;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,total,root;
		while(true){
			a= in.nextInt();
			b=in.nextInt();
			if(a==0 && b==0) break;
			total=0;
			for(int i =a;i<=b;i++){
				root = (int)Math.sqrt(i);
				if(root*root==i)
					total++;				
			}
			System.out.println(total);
		}

	}

}
