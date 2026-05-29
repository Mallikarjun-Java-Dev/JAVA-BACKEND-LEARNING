package DSA_HW;

public class replace {
public static void main(String[] args) {
	String str="java is a programming language";
	String res=str.replace("a", "e");
	System.out.println(res);
	
	//replaceAll
	String res2=str.replaceAll("a", "e");
	System.out.println(res2);
}
}
