package JavaSessions.Day2;

import java.util.Scanner;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
//		int num1=100;
//		int num2=200;
//		int num3=300;
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest is : "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("The greatest is : "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("The greatest is : "+num3);
		}else {
			System.out.println("All number are equal :");
		}

	}

}
