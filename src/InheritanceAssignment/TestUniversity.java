package InheritanceAssignment;

public class TestUniversity {

	public static void main(String[] args) {

//		Top Casting -- Parent class reference holds Child class object
		System.out.println("***********");
		University ob2 = new Stanford();
		University ob3 = new MIT();
		University ob4 = new NYU();
		ob2.classroom();
		ob2.eveningClasses();
		ob2.playGround();
		ob2.regularClasses();
//	Down Casting -- Child class reference holds Parent class object 
//	This will give Type mismatch error

//		Stanford ob5= new University();

//		Creating objects of child classes and calling overridden methods
		System.out.println("***********");
		Stanford s1 = new Stanford();
		MIT m1 = new MIT();
		NYU n1 = new NYU();
		s1.regularClasses();
		m1.regularClasses();
		n1.regularClasses();
		System.out.println("***********");
		University ob1 = new University();
		ob1.classroom();
		ob1.eveningClasses();
		ob1.playGround();
		ob1.regularClasses();

	}

}
