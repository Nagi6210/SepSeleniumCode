package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class UpdateArrayList_4 {

	public static void main(String[] args) {
		ArrayList<Double> d=new ArrayList<Double>();
		d.add(10.1);
		d.add(11.1);
		d.add(12.1);
		
		System.out.println(d);
		d.set(1, 100.1);
		System.out.println("After updaeing ArrayList is : \n"+ d);
		
	}

}
