package DSA_HW;
                        //using charAt() method
public class Solutions {

	public static String rev(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		return res;

	}
	
	public static void Pali(String str) {
		String res="";
		for(int i=str.length()-1;i>=0; i--) {
			res+=str.charAt(i);
		}
		if(str.equals(res)) {
		System.out.println("Palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}

	public static void main(String[] args) {
       System.out.println(rev("java"));
       Pali("madam");
       
	}
}



