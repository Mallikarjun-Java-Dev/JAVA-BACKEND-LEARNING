package DSA_HW;
                             //without using charAt() method
public class nocharAt {
	public static void rev(String str) {
		String[] s=str.split("");
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i]+"");

		}
		System.out.println();
	}
	public static void rev2(String str) {
		String[] s=str.split("");
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i]);
		}
	}
public static void main(String[] args) {
	rev("mallik");
	
	rev2("hi hello how are u");
}
}
