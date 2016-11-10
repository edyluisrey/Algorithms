package uva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*272 - TEX Quotes*/
public class TEXQuotes {

	public static void main(String[] args) {
         try {
			Scanner in= new Scanner(new File("TEXQuotes.in"));
			boolean start= true;
			while(in.hasNextLine()){
				String line = in.nextLine();
				for(int i=0;i<line.length();i++){
					if(line.charAt(i)=='\"'){
						if(start){
							start=false;
							System.out.print("``");  
							continue;
						}else{
						    System.out.print("''");	
						    start=true;
						    continue;
						}
					}
					System.out.print(line.charAt(i));
					
				}
				System.out.println("");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         

	}

}
