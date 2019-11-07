package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class ArrayListInsertion_2 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
//		System.out.println(colors);
		colors.add(1, "white");
		colors.add(colors.size(), "green");

		for (String str : colors) {
			System.out.println(str);
		}
	}

}
