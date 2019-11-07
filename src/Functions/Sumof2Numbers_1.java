package Functions;

public class Sumof2Numbers_1 {

	public static void main(String[] args) {
		Sumof2Numbers_1 ob1= new Sumof2Numbers_1();
		System.out.println("Sum is     : "+ob1.sum(10, 20));
		System.out.println("Sum is     : "+ob1.sum(11, 22));
		System.out.println("Sum is     : "+ob1.sum(12, 23));

	}
	
	public int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
