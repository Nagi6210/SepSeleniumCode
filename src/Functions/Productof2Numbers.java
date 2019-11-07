package Functions;

public class Productof2Numbers {
	public static void main(String[] args) {
		Productof2Numbers ob1= new Productof2Numbers();
		System.out.println("Product is : "+ob1.mul(10, 20));
		System.out.println("Product is : "+ob1.mul(11, 22));
		System.out.println("Product is : "+ob1.mul(12, 24));
		System.out.println("Product is : "+ob1.mul(13, 26));

	}
	
	public int mul(int a, int b) {
		int mul=a*b;
		return mul;
	}


}
