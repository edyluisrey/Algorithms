package uva;

import java.util.Scanner;
import java.util.Stack;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(true){
       	 long n=in.nextLong();
       	 if(n<0) break;
       	 Stack stack= new Stack();
       	 while(n>=3){
       		 stack.push(n%3);
       		 n=n/3;
       	 }	 
       	 String sTernary=""+n;
       	 while(!(stack.isEmpty()))
       		 sTernary+=stack.pop();
       	 System.out.println(sTernary);
        }
	}

}
