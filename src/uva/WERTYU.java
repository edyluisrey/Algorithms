package uva;

import java.util.Scanner;

public class WERTYU {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String keyboard= "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while(in.hasNext()){
			String s= in.nextLine();
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)==' ')
					System.out.print(" ");
				else
					System.out.print(keyboard.charAt(keyboard.indexOf(s.charAt(i))-1));
			}
			System.out.println();
		}

	}

}