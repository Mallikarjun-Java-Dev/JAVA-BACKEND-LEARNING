package DSA_HW;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		String str="hi hi how are are you you you java";
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		String[] s1=str.split(" ");
		for(String s:s1)
			map.put(s, map.getOrDefault(s,0)+1);
		
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
			
		});
	}

}
