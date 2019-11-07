package JavaSessions;

public class WrapperClasses {

	public static void main(String[] args) {
		byte b1=127;
		Byte b2=new Byte(b1);
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2.byteValue());
		System.out.println(b2.valueOf(b1));
		
		Byte b3=new Byte(b1);
		byte b4=b3.byteValue();
		System.out.println("b3 = "+b3);
		System.out.println("b4 = "+b4);

	}

}
