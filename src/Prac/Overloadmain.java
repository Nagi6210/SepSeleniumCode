package Prac;

public class Overloadmain {

	public static void main(String[] args) {
		System.out.println("Main method");
		main(10);
		main(10, 20);
		System.out.println("_____");
		Overloadmain ob=new Overloadmain();
		ob.main(10);
		Overloadmain.main(20);

	}
	public static void main(int a) {
		System.out.println("Main method with one arg");

	}
	public static void main(int a, int b) {
		System.out.println("Main method with 2 args");

	}

}
