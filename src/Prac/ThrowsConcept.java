package Prac;

public class ThrowsConcept {

	public static void main(String[] args) {
		ThrowsConcept ob1= new ThrowsConcept();
		ob1.m1();

	}
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		int i=9/0;
	}

}
