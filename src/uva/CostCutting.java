package uva;

import java.util.Arrays;
import java.util.Scanner;

public class CostCutting {
	 public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t,i=0;
			t=in.nextInt();
			while((t--)!=0){ i++;
				int[] a= new int[3];
				a[0]= in.nextInt();
				a[1]= in.nextInt();
				a[2]= in.nextInt();
				Arrays.sort(a);
				System.out.printf("Case %d: %d%n",i,a[1]);
			}
			in.close();
			
		}
}
