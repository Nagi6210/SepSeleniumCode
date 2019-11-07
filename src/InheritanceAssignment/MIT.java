package InheritanceAssignment;

public class MIT extends University{
	
	@Override
	public void regularClasses() {
		System.out.println("MIT University rerular classes stars from 9:00 am to 5:00 pm");
	}
	@Override
	public void eveningClasses() {
		System.out.println("MIT University evening classess start from 6:00 pm to 9:00 pm");
	}

	public void specialSessions() {
		System.out.println("Special session from MIT guests");
	}
	
	public void PHDCourse() {
		System.out.println("PHD Course from MIT university");
	}
	public void DualDegreeCourse() {
		System.out.println("Dual degree not allowed from MIT university");
	}


}
