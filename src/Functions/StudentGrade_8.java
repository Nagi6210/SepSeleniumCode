package Functions;

public class StudentGrade_8 {

	public static void main(String[] args) {
		
		StudentGrade_8 ob1=new StudentGrade_8();
		
		System.out.println(ob1.gradeTest(100));
		System.out.println(ob1.gradeTest(82));
		System.out.println(ob1.gradeTest(45));
		System.out.println(ob1.gradeTest(30));
		System.out.println(ob1.gradeTest(77));

	}
	
	public String gradeTest(int marks) {
		String grade="";
		
		if (marks >=91 && marks <= 100)
			grade="AA";
		else if (marks >= 81 && marks <=90)
			grade="AB";
		else if (marks >= 71 && marks <=80)
			grade="BB";		
		else if (marks >= 61 && marks <=70)
			grade="BC";		
		else if (marks >= 51 && marks <=60)
			grade="CD";		
		else if (marks >= 41 && marks <=50)
			grade="DD";		
		else
			grade="FAIL";
		
		return grade;

	}

}
