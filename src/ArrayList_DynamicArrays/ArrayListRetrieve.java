package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class ArrayListRetrieve {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(1,15);
		ar.addAll(ar);
		System.out.println(ar);
		ar.addAll(1, ar);
		System.out.println(ar);
		
//		int x=ar.get(2);
		System.out.println("2nd index element : "+ar.get(2));
		
		ar.set(1, 121);
		System.out.println(ar);

	}

}
