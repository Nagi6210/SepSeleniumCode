package Strings;

public class RemoveSpacesString {
	public static String remSpaces(String s1) {
		String s2;
//		s2=s1.trim();
		s2=s1.replaceAll(" ", "");
		return s2;
	}
	public static void main(String[] args) {
		System.out.println(RemoveSpacesString.remSpaces("   Hello   wor   ld   "));

	}

}
