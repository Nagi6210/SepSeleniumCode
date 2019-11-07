package Functions;

public class VoteEligibility_6 {

	public static void main(String[] args) {
		VoteEligibility_6 ob1=new VoteEligibility_6();
		ob1.voteTest(10);
		ob1.voteTest(18);
		ob1.voteTest(25);

	}
	
	public void voteTest(int age) {
		if (age >= 18) {
			System.out.println("Eligible to vote : Current age is : "+age);
		} else {
			System.out.println("Not eligible to vote until 18 : Current age is : "+age);
		}
	}

}
