package general;

public class OlympicArray {
	public static void main(String[] args) {
	   	isOlympic (new int[]{3, 2, 4});
	   	isOlympic (new int[]{1, 1000, 100, 10000, 2});
   }
   
   static int isOlympic (int[ ] a){
	   int sum=0;
	   boolean ind=false;
	   for(int i=0; i<a.length; i++){
		  if(a[i]>=0){
			  sum=0;
			  for(int j=0; j< a.length;j++){
				  if(a[i]!=a[j]){
					  if(a[i]>a[j])
						  sum=sum+a[j];
				  }
			  }
			  if(a[i]>=sum)
				  ind=true;
			  else
				  break;
		  }else
			  return 0;
	   }
	   if(ind)
		   return 1;
	   return 0;
   }
}
