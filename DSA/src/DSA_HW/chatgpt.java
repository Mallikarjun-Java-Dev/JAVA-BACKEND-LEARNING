package DSA_HW;

public class chatgpt {
	//brute force code
//public static void main(String[] args) {
//	int[] a= {2, 7, 11, 15};
//	int target=9;
//	for(int i=0;i<a.length;i++) {
//		for(int j=a.length-1;j>i;j--) {
//			if(a[i]+a[j]==target) {
//				System.out.println("["+i+","+j+"]");
//			}
//		}
//	}
//}
//}
//optimized code
public static void main(String[] args) {
	int[] a= {2, 7, 11, 15};
	int target=9;
	for(int i=0;i<a.length-1;i++) {
			if(a[i]+a[i+1]==target) {
				System.out.println("["+i+","+(i+1)+"]");
			}
		}
	}
}

//best code
//public static void main(String[] args) {
//	int[] a= {2, 7, 11, 15};
//	int target=9;
//	int left=0;
//	int right=a.length-1;
//	while(left<right) {
//		if(a[left]+a[right]==target) {
//			System.out.println("["+left+","+right+"]");
//			break;
//		}
//		else if(a[left]+a[right]>target) {
//			right--;
//		}
//		else {
//			left++;
//		}
//	}
//}
//
//String s="A man a plan a canal Panama";
//String[] s1=s.split(" ");
//for(int i)
