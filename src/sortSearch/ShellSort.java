package sortSearch;

import java.util.Arrays;

public class ShellSort {

	public static void sort(int a[]){
	   for(int gap =a.length/2; gap>0;gap=gap/2){
		   for( int i = gap; i < a.length; i++ )
		      {		
			   int j=i-gap; 
			   while(j>=0){  
				     int tem=j+gap;
		        	 if(a[j]>a[tem]){		        		
		        	     j=-1;		        	    
		        	 }else{
		        		 swap(a,j,tem);
		        		 j-=gap;
		             }
		         }
		      }
	   }
	}
	
	public static void swap(int a[],int i, int j){
    	int temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,0,3,7,1,5,9};
	    sort(a);
	    System.out.println(Arrays.toString(a));
	}

}
