package Prac;

public class Tostring {
	
	String name;
	String course;
	String time;
	
	
	public Tostring() {
		super();
	}


	public Tostring(String name, String course, String time) {
		this.name = name;
		this.course = course;
		this.time = time;
	}

	
	

	@Override
	public String toString() {
		return "Tostring [name=" + name + ", course=" + course + ", time=" + time + "]";
	}


	public static void main(String[] args) {
//		Tostring t1 = new Tostring();
		Tostring t1 = new Tostring("Naveen", "Java", "6:30 AM");
//		System.out.println(t1.toString());
		System.out.println(t1);
		System.out.println(t1.toString());

	}

}
