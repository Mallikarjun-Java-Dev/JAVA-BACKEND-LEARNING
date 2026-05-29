package DSA_HW;

import java.util.HashSet;
import java.util.Set;

public class Longest_SubString {
public static void main(String[] args) {
	String str="abcabccbb";
	Set<Character> lhs=new HashSet<>();
	
	int i=0, j=0, maxLength=0;
	while(i<str.length()) {
		if(!lhs.contains(str.charAt(i))) {
			lhs.add(str.charAt(i));
			maxLength=Math.max(maxLength , lhs.size());
			i++;
		}else {
			lhs.remove(str.charAt(j));
			j++;
		}
	}
			System.out.println(maxLength);
   }
}
