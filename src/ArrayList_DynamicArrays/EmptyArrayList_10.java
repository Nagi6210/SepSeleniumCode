package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class EmptyArrayList_10 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		System.out.println("Before Emptying : " + ar);
		ar.clear();
		System.out.println("After  Emptying : " + ar);
	}

}
