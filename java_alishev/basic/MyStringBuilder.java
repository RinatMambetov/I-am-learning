public class MyStringBuilder {
	public static void main(String[] args) {

		StringBuilder strbld = new StringBuilder("hello");
		strbld.append(" my").append(" friend!");
		System.out.println(strbld.toString());

		System.out.printf("[%10s] [%-10d] [%10.3f]\n", "hello", 42, 3.14);
	}
}
