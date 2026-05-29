package Searching;


public class LinearSearch {
public static void main(String[] args) {
	int[] a= {2,3,4,7,5,8,9};
	     //   0 1
	int find=7;
	for(int i=0; i<a.length;i++) {
		if(a[i]==find) {
			System.out.println("the value is present at index:"+i);
			return;
		}
	}
	System.out.println("value is not present!");
}
}
