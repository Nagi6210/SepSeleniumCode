package Prac;

public interface inrerface1 {
	int rollnum=123;
	
	public void dispay1();
	
	default void test() {
		System.out.println("This is the default method defined in interace");
	}

}
