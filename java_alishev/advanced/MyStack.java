import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {

		Stack<Num> s = new Stack<>();

		s.push(new Num(1));
		s.push(new Num(2));
		s.push(new Num(3));

		for (Num num : s) {
			System.out.println(num);
		}

		System.out.println("--peek--");
		System.out.println(s.peek()); // просмотр стопки сверху
		System.out.println("--pop--");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("--empty--");
		System.out.println(s.empty());
	}

	static class Num {

		private int num;

		public Num(int num) {
			this.num = num;
		}

		@Override
		public String toString() {
			return "Num [num=" + num + "]";
		}
	}
}
