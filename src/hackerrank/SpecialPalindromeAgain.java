package hackerrank;

public class SpecialPalindromeAgain {
	
	// Complete the substrCount function below.
    static long substrCount(int n, String s) {
        if (n<=1) return n;
        int sum=0;
        for(int i =0; i< n; i++){
            char pre = s.charAt(i);
            int cont = 1;
            while((i+1)<n && pre==s.charAt(i+1)){
                i++;
                cont++;
            }
            sum+= (cont*(cont-1))/2;
        }
        for(int i=1; i< (n-1); i++){
            int l=i-1;
            int r=i+1;  
            char prev=s.charAt(i+1);            
            while(r<n && l>=0 && s.charAt(l)==s.charAt(r) && s.charAt(i)!=s.charAt(r) && prev==s.charAt(r)){
                l--;
                r++;
                sum=sum+1; 
            }
        }
        return n+sum;
    }
}
