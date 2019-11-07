package LoopsAssignment;

public class NumberReverse3 {

	public static void main(String[] args) {
		System.out.println("Using for loop");
		for(int i=10; i>0;i--)
			System.out.print(i+" ");
		
		System.out.println("\nUsing while loop");
		int i=10;
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println("\nUsing do while loop");
		i=10;
		do {
			System.out.print(i+" ");
			i--;
		}while(i>0);

	}

}
