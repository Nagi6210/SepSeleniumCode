package InheritancePractise;

public class BMW extends Car {
	
	public BMW() {
		System.out.println("BMW Constructor : ");
	}
	
	public BMW(int x) {
		System.out.println("BMW one arg Constructor : "+x);
	}
	
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void airSuspension() {
		System.out.println("BMW -- airSuspension");
	}

}
