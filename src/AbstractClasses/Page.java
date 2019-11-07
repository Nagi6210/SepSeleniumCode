package AbstractClasses;

public abstract class Page {
	
	public  Page(int x) {
		System.out.println("Abstract class One arg constructor.... Page class"+x);
	}
	
	public  Page(int x, int y) {
		System.out.println("Abstract class two arg constructor.... Page class"+x+" : "+y);
	}
	
	
	public  Page() {
		System.out.println("Abstract class constructor.... Page class");
	}
	

	abstract public void m1();
	public abstract void m2();
	
	public static void sm3() {
		System.out.println("Static method inside abstract method");
	}

}
