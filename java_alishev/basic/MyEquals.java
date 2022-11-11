public class MyEquals {

	public static void main(String[] args) {

		InnerMyEquals class1 = new InnerMyEquals(1);
		InnerMyEquals class2 = new InnerMyEquals(1);

		// false
		System.out.println(class1 == class2);
		// true
		System.out.println(class1.equals(class2));

		String str1 = "hello";
		String str2 = "hello123";
		str2 = str2.substring(0, 5);

		System.out.println(str2);
		// true
		System.out.println(str1.equals(str2));
		// false
		System.out.println(str1 == str2);
	}
}

class InnerMyEquals {

	private int id;

	public InnerMyEquals(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		// downcasting
		InnerMyEquals class2 = (InnerMyEquals) obj;
		return this.id == class2.id;
	}
}
