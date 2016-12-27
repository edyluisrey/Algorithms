package uva;

import java.util.Scanner;

public class PeterSmokes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,k,total;
		while(in.hasNext()){
			n=in.nextInt();
			k=in.nextInt();
			total=n;
			while(n>=k){
				total+=n/k;
				n=(n/k)+(n%k);
			}
			System.out.println(total);
		}

	}

}
