package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//Integral Datatypes -- byte, short, int long
		
		byte b1=127;
		byte b2=-128;
		System.out.println("b1 =  "+b1+" \tb2"+b2);
		System.out.println("Min Value : "+Byte.MIN_VALUE+"\nMaz Value : "+Byte.MAX_VALUE+"\t"+"\nNo of Bytes : "+Byte.BYTES);
		System.out.println("***************");
		short s1=-32768;
		short s2=32767;
		System.out.println("s1 = "+s1+" \t"+s2);
		System.out.println("Min Value : "+Short.MIN_VALUE+"\nMax Value : "+Short.MAX_VALUE+"\nNo of Bytes:"+Short.BYTES);
		System.out.println("***************");
		int i1=-123456;
		int i2=1234567;
		System.out.println("i1 = "+i1+" \ti2="+i2);
		System.out.println("Min Value : "+Integer.MIN_VALUE+"\nMax Value : "+Integer.MAX_VALUE+"\nNof of Bytes : "+Integer.BYTES);
		System.out.println("***************");
		long l1=-327689;
		long l2=327679;
		System.out.println("l1 = "+l1+" \t"+l2);
		System.out.println("Min Value : "+Long.MIN_VALUE+"\nMax Value : "+Long.MAX_VALUE+"\nNo of Bytes:"+Long.BYTES);
		System.out.println("***************");
		float f1=12.3f;
		float f2=(float)12.3;
		System.out.println("f1 = "+f1+" f2 = "+f2);
		System.out.println("Min Value : "+Float.MIN_VALUE+"\nMin exponent : "+Float.MIN_EXPONENT+"\nMax Value : "+Float.MAX_VALUE+"\nMax exponent : "+Float.MAX_EXPONENT);
		System.out.println("***************");
		double d1=123.456;
		System.out.println("d1 = "+d1);
		System.out.println("Min Value : "+Double.MIN_VALUE+"\nMin exponent : "+Double.MIN_EXPONENT+"\nMax Value : "+Double.MAX_VALUE+"\nMax exponent : "+Double.MAX_EXPONENT);
		System.out.println("***************");
		char c1='a';
		System.out.println("c1 = "+c1);
		System.out.println("Min Value : "+Character.MIN_VALUE+"\nMax Value : "+Character.MAX_VALUE+"\nsize : "+Character.BYTES);		
		System.out.println("***************");
		boolean bo1=true;
		System.out.println("b1= "+b1);
		System.out.println(Boolean.TRUE);		
		System.out.println("***************");
		String st1="Hello World";
		System.out.println(st1);
		
	}

}
