package DSA_HW;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		Map<String,Integer> m1=new LinkedHashMap<String, Integer>();
		String str="hi hi how are are you you you java";
		String[] s1=str.split(" ");
		for(String s :s1)
			m1.put(s,m1.getOrDefault(s,0)+1);
		m1.forEach((key,value)->{
			if(value==1) {
				System.out.println(key+" "+value);
			}
			
		});
		System.out.println();
		

	}

}
