package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class trimToArrayListSize {

	public static void main(String[] args) {
		ArrayList<Integer> ar =new ArrayList<Integer>(50);
		System.out.println(ar.size());
		ar.add(1);
		ar.add(2);
		ar.add(3);
		System.out.println(ar.size());
		ar.trimToSize();
		System.out.println(ar.size());

	}

}
