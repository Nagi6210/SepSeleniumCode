package ArrayList_DynamicArrays;

import java.util.ArrayList;

public class Remove3rdElement {

	public static void main(String[] args) {
		ArrayList<Byte> b= new ArrayList<Byte>();
		b.add((byte) 1);
		b.add((byte) 2);
		b.add((byte) 3);
		b.addAll(b);
		System.out.println("Begore remove : "+b);
		b.remove(3);
		System.out.println("After remove  : "+b);

	}

}
