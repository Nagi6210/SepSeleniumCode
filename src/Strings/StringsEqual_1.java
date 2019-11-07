package Strings;

public class StringsEqual_1 {

	public void StrCmp(String s1, String s2) {
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println(s1 + " and " + s2 + " are same");
		} else {
			System.out.println(s1 + " and " + s2 + " are different strings");

		}
	}

	public static void main(String[] args) {

		StringsEqual_1 ob1 = new StringsEqual_1();
		ob1.StrCmp("Hello", "World");
		ob1.StrCmp("Hello", "Hello");
	}

}
