package AbstractClasses;

public class LoginPage extends Page{

	public  LoginPage() {
		System.out.println("LoginPage constructor");
	}
	
	public  LoginPage(int x) {
		System.out.println("LoginPage one arg constructor : "+x);
	}
	public  LoginPage(int x, int y) {
		System.out.println("LoginPage two arg constructor : "+x+" : "+y);
	}
	
	@Override
	public void m1() {
		System.out.println("Abstract method m1 .... implemented in LoginPage");
		
	}

	@Override
	public void m2() {
		System.out.println("Abstract method m2 .... implemented in LoginPage");
		
	}
	
	public void m4() {
		System.out.println("Non abstract method from .... LoginPage");
	}
	

}
