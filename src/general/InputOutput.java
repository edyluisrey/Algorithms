package general;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= 0;//in.nextInt();
		int a, b;
		while(n>0){  n--;
			a=in.nextInt();
			b=in.nextInt();
			System.out.printf("%d + %d =%d %n",a,b,a+b);
		}
		
		try {
			Scanner in2= new Scanner(new File("eof.in"));
			while(in2.hasNextLine()){
				int num = in2.nextInt();
				int sum=0;
				for(int i=0;i<num;i++){
					sum=sum+in2.nextInt();
				}
				System.out.println(sum);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
