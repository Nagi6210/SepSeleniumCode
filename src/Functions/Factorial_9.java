package Functions;

public class Factorial_9 {

	public static void main(String[] args) {
		Factorial_9 ob1=new Factorial_9();
		System.out.println(ob1.fact(5));
		System.out.println(ob1.fact(0));
		System.out.println(ob1.fact(-5));

	}
	
	public int fact(int num) {
		if(num==0)
			return 1;
		else if(num>=1) {
			return num*fact(num-1);
		} else {
			System.out.println("Factorial doesnt apply for -ve numbers");
			return -1;
		}
		
	}

}
