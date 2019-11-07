package JavaSessions.Day2;

import java.util.Scanner;

public class PosNegNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
		String s1=sc.next();
		int num1=Integer.parseInt(s1);
		
		if(num1>0) {
			System.out.println("Positive Number");
		} else if(num1<0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Neither positive not negative");
		}

	}

}
