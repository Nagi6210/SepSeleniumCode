package JavaSessions.Day2;

import java.util.Scanner;

public class CapitalOfCountry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country = sc.nextLine();
		country= country.toUpperCase();
		
		switch(country) {
		case "INDIA" :
			System.out.println("New Delhi");
			break;
		case "RUSSIA" :
			System.out.println("Mascow");
			break;
		case "UK":
			System.out.println("London");
			break;
		case "USA":
			System.out.println("Washington");
			break;
		case "SRI LANKA":
			System.out.println("Colombo");
			break;
		case "PAKISTAN":
			System.out.println("Islamabad");
			break;
		case "BANGLADESH":
			System.out.println("Dhakha");
			break;
		case "CHINA":
			System.out.println("Beijing");
			break;
		case "FRANCE":
			System.out.println("Paris");
			break;
		case "GERMANY":
			System.out.println("Berlin");
			break;
		default:
			System.out.println("No country is defined with the name : "+country);
		}

	}

}
