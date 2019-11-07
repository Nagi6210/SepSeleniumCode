package Strings;

public class ReverseName_5 {

	public String reverseString(String s1) {
		int len=s1.length();
		String s2="";
		for(int i=len-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		return s2;
	}
	public static void main(String[] args) {
		ReverseName_5 ob=new ReverseName_5();
		String s1="Nagi Reddy";
//		System.out.println("String is : "+s1);
		System.out.println("Reverse of : \'"+s1+"\' is : \'"+ob.reverseString(s1)+"\'");

	}

}
