package sortSearch;

import java.util.Arrays;

public class InsertionSort {
    
	public static void sort(int a[]){
		int aux,elem;
		for(int i=1;i<a.length;i++){
			elem=i;
			aux=a[i];
			while(elem>0 && aux<a[elem-1]){
				a[elem]=a[elem-1];
				elem--;		
			}
			a[elem]=aux;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,9,2,4,3};
	    sort(a);
	    System.out.println(Arrays.toString(a));
	}

}
