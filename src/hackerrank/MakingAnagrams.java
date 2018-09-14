package hackerrank;

public class MakingAnagrams {
	
	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int re=0;
        int[] v = new int[26];
        for(char c : a.toCharArray())
            v[c - 'a']++;
        for(char c: b.toCharArray())
            v[c-'a']--;
        for(int i= 0; i< 26; i++){
            re+=Math.abs(v[i]); 
        }
        return re;
    }
}
