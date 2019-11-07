package ArrayAssignment.Day4;

public class ArrayPatternMatrix {

	public static void main(String[] args) {
		
		int a[][]= new int[4][10];
		int k=0;
		
//		System.out.println(a.length);
//		System.out.println(a[0].length);
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=k++;
			}
		}
		
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(String.format("%02d ", a[i][j]));
			}
			System.out.println();
		}

	}

}
