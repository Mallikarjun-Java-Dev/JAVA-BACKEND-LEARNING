package DSA_HW;

import java.util.LinkedHashMap;
import java.util.Map;

public class map4 {
Map<String,Integer> m1=new LinkedHashMap<String, Integer>();
String str="hi hi how are are you you you java";
String[] s2=str.split(" ");
for(String s: s2)
m1.put(s, m1.getOrDefault(s,0)+1);
m1.forEach((key,value)->{
	System.out.println("key");
});
}}
