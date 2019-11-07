package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class Swap2ArratElements {

	public void swap(int x, int y, ArrayList<Integer> ar1) {
		int temp=(int) ar1.get(x);
		ar1.set(x, ar1.get(y));
		ar1.set(y, temp);
//		return ar;
	}
	
	public static void main(String[] args) {
		Swap2ArratElements ob=new Swap2ArratElements();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		
		System.out.println("Before Swapping : "+ar);
		ob.swap(2, 3, ar);
		System.out.println("After  Swapping : "+ar);
		
		

	}

}
