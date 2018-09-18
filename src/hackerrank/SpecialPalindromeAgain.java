package hackerrank;

public class SpecialPalindromeAgain {
	
	// Complete the substrCount function below.
	static long substrCount(int n, String s) {
	    if (n<=1) return n;
	    int re=0;
	    for(int i=0; i< (n-1);i++){
	        for(int j=i+2; j<=n; j++){ 
	            if(j<n && isPalindrome(s.substring(i,j))) re++;
	            if(j>=n && isPalindrome(s.substring(i))) re++;
	        }
	    }
	    return n+re;
	}
	
	static boolean isPalindrome(String s){  
	    char pre = s.charAt(0);
	    for(int i=0; i< s.length()/2; i++){
	        if(pre!=s.charAt(i) || pre!=s.charAt((s.length()-1)-i)) return false;
	    }
	    return true;
	}
}
