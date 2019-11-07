package Prac;

import java.util.HashMap;
import java.util.Map;

public class CounteachCharInString {

	public static void main(String[] args) {
		String s1="Success";
		s1=s1.toLowerCase();
		char[] ch=s1.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(char ch1:ch) {
			if(hm.containsKey(ch1)) {
				hm.put(ch1, hm.get(ch1)+1);
			}
			else {
				hm.put(ch1, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
