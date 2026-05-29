package sorting;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[] arr= {10,20,50,43,23,45,24,12,56};
	
	for(int i=0; i<arr.length; i++) {
		int cmin=i;
				
		for(int j=i+1; j<arr.length;j++) {
			if(arr[j]<arr[cmin]) {
				cmin=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[cmin];
		arr[cmin]=temp;
	}
	System.err.println(Arrays.toString(arr));
}
}
