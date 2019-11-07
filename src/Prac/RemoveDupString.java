package Prac;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupString {

	public static void main(String[] args) {
		String s1="Success";
		s1=s1.toLowerCase();
		char[] ch=s1.toCharArray();
		Set<Character> s2=new HashSet<Character>();
		for(char ch1:ch) {
			s2.add(ch1);
		}
		
		for(char ch1:s2)
			System.out.println(ch1);

	}

}
