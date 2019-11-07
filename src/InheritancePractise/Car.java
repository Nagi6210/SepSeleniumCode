package InheritancePractise;

public class Car extends Vehicle {
	
	public Car() {
		System.out.println("Car -- constructor");
	}
	
	public Car(int x) {
		System.out.println("Car one arg -- constructor"+x);
	}
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}

}
