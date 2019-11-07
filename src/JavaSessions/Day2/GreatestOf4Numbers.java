package JavaSessions.Day2;

import java.util.Arrays;

public class GreatestOf4Numbers {

	public static void main(String[] args) {
		int[] arr = { -3, -4, 5, 121 };
		Arrays.sort(arr);
		System.out.println("The greatest is : " + arr[arr.length - 1]);

		GreatestOf4Numbers ob1 = new GreatestOf4Numbers();
		int maxnum = ob1.max(1, 2, 3, 4);
		System.out.println("The greatest is : " + maxnum);

	}

	int max(int a, int b, int c, int d) {
		int e = a > b ? a : b;
		int f = c > d ? c : d;
		return e > f ? e : f;
	}

}
