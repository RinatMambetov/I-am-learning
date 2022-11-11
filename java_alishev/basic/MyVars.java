public class MyVars {

	public static void main(String[] args) {
		System.out.println("print test");
		int myInt = 5;
		System.out.println("myInt is " + myInt);
		short myShort = 31000;
		System.out.println("myShort is " + myShort);
		long myLong = 429496729L;
		System.out.println("myLong is " + myLong);
		double myDouble = 3.14;
		System.out.println("myDouble is " + myDouble);
		float myFloat = 1.1412F;
		System.out.println("myFloat is " + myFloat);
		char myChar = 'a';
		System.out.println("myChar is " + myChar);
		boolean myBool = true;
		System.out.println("myBoolean is " + myBool);
		byte myByte = 127;
		System.out.println("myByte is " + myByte);
		String myString = "hello";
		System.out.println("myString is " + myString);

		int newInt = (int) myLong;
		System.out.println(newInt);
		int newInt2 = (int) myDouble;
		System.out.println(newInt2);
		float newFlo = (float) myDouble;
		System.out.println(newFlo);
		byte newByte = (byte) myShort;
		System.out.println(newByte);

		Integer i = Integer.valueOf(12);
		System.out.println(i.compareTo(13));
	}
}
