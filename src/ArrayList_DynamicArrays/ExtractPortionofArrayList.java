package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class ExtractPortionofArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		
		System.out.println("Initial Array List : "+ar);
		System.out.println("Sub list : "+ar.subList(1, 4));

	}

}
