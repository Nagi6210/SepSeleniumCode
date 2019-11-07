package Functions;

public class MaxMinof3Numbers {

	public static void main(String[] args) {
		MaxMinof3Numbers ob1=new MaxMinof3Numbers();
		
		System.out.println("Max of 3 numbers is : "+ob1.max(2, 3, 4));
		System.out.println("Max of 3 numbers is : "+ob1.min(2, 3, 4));

	}
	public int max(int a, int b, int c) {
		int max=0;
		if (a>b && a>c)
			max=a;
		else if (b>c && b>a)
			max=b;
		else if (c>a && c>b)
			max=c;
		else {
			System.out.println("All are equal");
			max=a;
		}
		return max;
	}

	public int min(int a, int b, int c) {
		int min=0;
		if (a<b && a<c)
			min=a;
		else if (b<c && b<a)
			min=b;
		else if (c<a && c<b)
			min=c;
		else {
			System.out.println("All are equal");
			min=a;
		}
		return min;
	}


}
