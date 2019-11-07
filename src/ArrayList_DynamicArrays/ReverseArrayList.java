package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		
		System.out.println("Array List : "+ar);
		System.out.println("Reverse of ArrayList : ");
		for(int i=ar.size()-1;i>=0; i--) {
			System.out.print(ar.get(i)+" ");
		}
		

	}

}
