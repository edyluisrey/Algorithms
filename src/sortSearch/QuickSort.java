package sortSearch;

import java.util.Arrays;

public class QuickSort {
	
	public static void sort(int arr[], int left, int right){
	   double pivot;
	   int i, j;
	   i=left; j=right;
	   pivot= arr[(left+right)/2];
	   do{
		   while(arr[i]<pivot) 
			   i++;
		   while(arr[j]>pivot)
			   j--;
		   if(i<=j){
			   swap(arr,i,j);
			   i++;
			   j--;
		   }
	   }while(i<=j);
	   if(left<j)
		   sort(arr, left, j);
	   if(i<right)
		   sort(arr, i, right);
	}
	
	public static void swap(int arr[],int i, int j){
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
	
	public static void main(String[] args) {
		int a[]= {6,0,3,7,1,5,9};
	    sort(a,0,a.length-1);
	    System.out.println(Arrays.toString(a));
	}
}
