package Functions;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber ob1=new PrimeNumber();
		ob1.primeTest(10);
		ob1.primeTest(17);
		ob1.primeTest(7);
		ob1.primeTest(20);

	}
	
	public void primeTest(int num) {
		int count=0;
		for (int i=2; i<num;i++) {
			if(num%i ==0)
				count++;
		}
		
		if(count==0)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is composite");
	}

}
