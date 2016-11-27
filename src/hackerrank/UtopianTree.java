package hackerrank;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int h=1;
            for(int j=1;j<=n;j++){
            	if(j%2==0)
            		h=h+1;
            	else
            		h=h*2;
            }
            System.out.println(h);
        }
	}

}
