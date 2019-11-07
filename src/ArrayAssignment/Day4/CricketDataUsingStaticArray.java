package ArrayAssignment.Day4;

public class CricketDataUsingStaticArray {

	public static void main(String[] args) {
//		--name, age, team name, DOB, gender, Strike Rate
//		--Try to create multiple Object Arrays for different players 
//		--Try to print all the values of each player on the console
		
		Object[][] data=new Object[3][6];
		data[0][0] = "Sachin ";
		data[0][1] = 46;
		data[0][2] = "India";
		data[0][3] = "24-04-1973";
		data[0][4] = 'M';
		data[0][5] = 48.5;

		data[1][0] = "Ganguly";
		data[1][1] = 47;
		data[1][2] = "India";
		data[1][3] = "08-07-1972";
		data[1][4] = 'M';
		data[1][5] = 44.5;

		data[2][0] = "Dravid ";
		data[2][1] = 46;
		data[2][2] = "India";
		data[2][3] = "11-01-1973";
		data[2][4] = 'M';
		data[2][5] = 42.5;
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

}
