package Strings;

public class FindWordInSentence {
	
	public static void searchString(String s1, String s2) {
		if(s1.contains(s2)) {
			System.out.println("String : \'"+s2+"\' found in : \'"+s1+"\'");
		} else {
			System.out.println("String : \'"+s2+"\' not found in : \'"+s1+"\'");
		}
	}
	public static void main(String[] args) {
		String str1="Guys Welcome to Naveen automation labs";
		
		FindWordInSentence.searchString(str1, "Naveen");
		FindWordInSentence.searchString(str1, "naveen");
		FindWordInSentence.searchString(str1, "t");
	}

}
