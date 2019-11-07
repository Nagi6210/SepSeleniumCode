package Functions;

public class CircumferenceAndAreaOfCircle {

	public static void main(String[] args) {
		CircumferenceAndAreaOfCircle ob1=new CircumferenceAndAreaOfCircle();
		ob1.circle(5);
		ob1.circle(50);

	}
	public void circle(int radius) {
		float area=(float)(3.14*(radius*radius));
		float circumference=(float)(2*3.14*radius);
		System.out.println("Area of circle = "+area+
				"\nCircumference of circle = "+circumference);
	}

}
