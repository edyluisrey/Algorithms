package hackerrank;

import java.util.Scanner;

public class BestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=0,sum=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i<10){
                    if(max<i)
                        max=i;
                }else{
                    sum=i%9;
                    if(max<sum)
                        max=i;
                }
            }
        }
        System.out.println(max);
	}

}
