package hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String [] pair_left = new String[t];
		String [] pair_right = new String[t];
		
		for (int i = 0; i < t; i++) {
		    pair_left[i] = s.next();
		    pair_right[i] = s.next();
		}
		
		HashSet set= new HashSet();
		int cont =0;
		for(int i=0;i<t;i++){
		    if(set.add(pair_left[i]+" "+pair_right[i]))
		        cont++;
		    System.out.println(cont);
		}

	}

}
