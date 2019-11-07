package Strings;

public class SubStringsSplit_9 {

	public static void main(String[] args) {
		String s1 = "Saat vik Reddy";
		String[] str = s1.split("\\s+");

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
