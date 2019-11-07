package Functions;

public class EvenOdd_5 {

	public static void main(String[] args) {
		EvenOdd_5 ob1=new EvenOdd_5();
		ob1.evenodd(5);
		ob1.evenodd(10);

	}
	
	public void evenodd(int num) {
		if(num%2==0) {
			System.out.println("The number : "+num+" is even ");
		} else {
			System.out.println("The number : "+num+" is odd  ");
		}
	}

}
