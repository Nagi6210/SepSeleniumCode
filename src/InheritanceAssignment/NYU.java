package InheritanceAssignment;

public class NYU extends University{
	
	@Override
	public void regularClasses() {
		System.out.println("NYU University rerular classes stars from 9:00 am to 5:00 pm");
	}
	@Override
	public void eveningClasses() {
		System.out.println("NYU University evening classess start from 6:00 pm to 9:00 pm");
	}

	public void specialSessions() {
		System.out.println("Special session from NYU guests");
	}
	
	public void PHDCourse() {
		System.out.println("PHD Course from NYU university");
	}
	public void DualDegreeCourse() {
		System.out.println("Dual degree not allowed from NYU university");
	}


}
