package sortSearch;

import java.util.Arrays;

public class ExchangeSort {
    
	public static void swap(int a[],int i, int j){
    	int temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
    
	public static void sort(int a[]){
    	for(int i=0;i<a.length;i++){
    		for(int j=i+1;j<a.length;j++){
    			if(a[i]>a[j]){
    				swap(a,i,j);
    			}
    		}
    	}
    }
    
   public static void main(String[] args) {
       int a[]= {5,1,9,2,4,3};
       sort(a);
       System.out.println(Arrays.toString(a));
   }
}
