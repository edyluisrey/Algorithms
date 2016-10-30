package general;

public class TestMUM {
	
	public static void main(String[] args) {
	    System.out.println(isAsccending(123));  //1
	    System.out.println(isAsccending(3124));  //0
	    System.out.println(isAsccending(11));   //0
	    System.out.println(isAsccending(3)); //1
	    
	    System.out.println("second ");
	    System.out.println(isSarada(new int[]{1,5,13}));  //1
	    System.out.println(isSarada(new int[]{1,5}));  //0
	    System.out.println(isSarada(new int[]{1,5,13,7,8,5,13})); //1
	    System.out.println(isSarada(new int[]{1,5,13,4,5}));  //0
	    System.out.println(isSarada(new int[]{1,3,13})); //1
	}
	
	static int isAsccending(int n){
		int temp=0;
		int newNumber=n;
		if(n>=10)
			temp=newNumber%10+1;
		else
			return 1;
		int mod=0;
		
		while(newNumber>=10){
			mod=newNumber%10;
			newNumber=newNumber/10;
			if(temp>mod){
				temp=mod;
			}else
				return 0;
		}
		
		if(temp>newNumber)
			return 1;
		else
			return 0;
	}
	
	static int isSarada(int[] a){
		
		for(int i=0;i<a.length;i++){
			if(a[i]==5){
				if(!((i+1)<a.length && a[i+1]==13)){
					return 0;
				}
			}
		}
		
		return 1;
	}
	
	
}
