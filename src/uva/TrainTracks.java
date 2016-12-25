package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainTracks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int count,s,t = Integer.parseInt(in.readLine());
		String line;
		while((t--)!=0) {
            count = 0;
            line = in.readLine();
            s = line.length();
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == 'M')  
                	count++;
                if(line.charAt(i) == 'F')  
                	count--;
            }
            if(count==0 && s>2)
            	System.out.println("LOOP");
            else
            	System.out.println("NO LOOP");
        }
	}

}
