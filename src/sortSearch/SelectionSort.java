package sortSearch;

import java.util.Arrays;

public class SelectionSort {
    
	public static void swap(int a[],int i, int j){
    	int temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
	
	public static void sort(int a[]){
		int min;
		for(int i=0;i<a.length;i++){
			min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min])
					min=j;
			}
			if(i!=min)
				swap(a,i,min);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,9,2,4,3};
	    sort(a);
	    System.out.println(Arrays.toString(a));
	}

}
