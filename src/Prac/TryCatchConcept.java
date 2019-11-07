package Prac;

public class TryCatchConcept {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		try {
		int i=9/0;
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");

		}
		
		catch (Exception e) {
			System.out.println("Exception caught");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	
	}

}
