package hackerrank;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = 26;
		int h[] = new int[n];
		int max=0,pos;
		for(int h_i=0; h_i < n; h_i++){
		    h[h_i] = in.nextInt();
		}
		String word = in.next();
		for(int i=0;i<word.length();i++){
		    pos= word.charAt(i)-97;
		    if(max<h[pos])
		    	max=Math.max(h[pos], max);
		}
		System.out.println(max*word.length());    

	}

}
