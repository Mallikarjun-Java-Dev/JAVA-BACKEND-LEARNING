package DSA_HW;

public class longestPalindrome {
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "babbad";
		int maxlength = 0;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String temp = str.substring(i, j);
				if (isPalindrome(temp) && temp.length() > maxlength) {
					maxlength = temp.length();
					result = temp;
				}
			}
		}
		System.out.println("Longest Palindrome: " + result);
        System.out.println("Length: " + maxlength);
	}
}
