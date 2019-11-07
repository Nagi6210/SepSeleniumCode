package JavaSessions.Day2;

import java.util.Scanner;

public class VoteEligibilityTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();
		
		if(age < 18) {
			System.out.println("Not eligible for Vote");
		} else {
			System.out.println("Eligible for Vote");
		}

	}

}
