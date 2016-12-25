package uva;

import java.util.Scanner;

public class HappyBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		int np;
		boolean all=false;
		String [] words=new String [] {"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
		np=in.nextInt(); 
		String [] names= new String[np];
		
		for (int i = 0; i < np; ++i)
		    names[i]=in.next();
		
		int i = 0;  
		while(!all) {    
		    System.out.println(names[i%np] + ": " + words[i%16]);  
		    if(i%16 == 15 && i >= np) 
		         all = true;  
		    i++;  
		}

	}

}
