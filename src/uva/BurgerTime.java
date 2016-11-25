package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BurgerTime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		int s;
		String temp,line;
		while((temp=in.readLine())!=null){
		    s = Integer.parseInt(temp);
	        if(s == 0)
	           break;
	      line = in.readLine();
	      int D = -1;
	      int R = -1;
	      int min = Integer.MAX_VALUE;
	      for (int i = 0; i < line.length(); i++) {
	        if (line.charAt(i)== 'Z') {
	          min = 0;
		      break;
	        } else if (line.charAt(i) == 'R') {
	          R = i;
	        } else if (line.charAt(i) == 'D') {
	          D=i;
	        }
	        if (D != -1 && R != -1) {
	          min = Math.min(Math.abs(D - R), min);
	        }
	      }
	      System.out.println(min);
	 }
   }

}
