package Strings;

public class LastHalfofString {
	
	public String lastHalf(String s1) {
		String s2="";
		s2=s1.substring(s1.length()/2);
		return s2;
	}
	public static void main(String[] args) {
		LastHalfofString ob1=new LastHalfofString();
		System.out.println(ob1.lastHalf("Nagi Reddy"));
		System.out.println(ob1.lastHalf("NagiReddy"));

	}

}
