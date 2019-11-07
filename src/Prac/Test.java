package Prac;

public class Test implements inrerface1, interface2{
	@Override
	public void dispay1() {
		System.out.println("Display1() ... interface1");
	}
	
	
	@Override
	public void display2() {
		System.out.println("Display2() ... interface2");
		
	}
	
	public static void main(String[] args) {
		Test ts=new Test();
		
		ts.dispay1();
		ts.display2();
		ts.test();
		
//		ts.rollnum=1;
		System.out.println(Test.rollnum);
		System.out.println(Test.rollnum);
	}
}
