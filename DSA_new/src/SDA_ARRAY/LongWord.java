package SDA_ARRAY;

public class LongWord {
public static void main(String[] args) {
	String str="java is programing language";
	String[] s=str.split(" ");
	String Longest=" ";
	for(String word:s) {
		if(word.length()>Longest.length()) {
			Longest=word;
		}
	}
	System.out.println("Longest word is:"+Longest);
}
}
