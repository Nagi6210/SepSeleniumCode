package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class Colours_1 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add(1, "Blue");

		for (String s : colors) {
			System.out.println(s);
		}

	}

}
