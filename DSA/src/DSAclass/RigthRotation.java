package DSAclass;

public class RigthRotation {
	
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	int k=4;
	for(int i=0; i<arr.length; i++) {
		if(i<k) {
			System.out.println(arr[arr.length+i-k]);
		}else {
			System.out.println(arr[i-k]);
		}
	}
}
}
