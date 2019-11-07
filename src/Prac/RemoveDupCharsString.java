package Prac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupCharsString {

	public static void main(String[] args) {
		String s1=new String("LavanyayLLLLllllL");
		System.out.println("First string "+s1.hashCode());
		s1=s1.toLowerCase();
		System.out.println("Second String "+s1.hashCode());
		char[] ch=s1.toCharArray();
		System.out.println(ch);
		
		Set<Character> s2=new HashSet<Character>();
		List<Character> l2=new ArrayList<Character>();
		
		for (char temp:ch) {
			s2.add(temp);
			l2.add(temp);
			
		}
		
	System.out.println("Set = "+s2);
//		System.out.println("Listt = "+l2);
		
		for(char temp:s2) {
			System.out.println(temp);
		}
				
	}

}
