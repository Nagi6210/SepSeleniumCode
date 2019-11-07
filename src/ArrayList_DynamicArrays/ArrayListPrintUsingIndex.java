package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class ArrayListPrintUsingIndex {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();

		for (int i=1; i<=5; i++) {
			ar.add(i-1, i);
		}
		
		//System.out.println(ar);
		
		for(int i=0; i<ar.size(); i++) {
			System.out.print(ar.get(i)+" ");
			
		}

	}

}
