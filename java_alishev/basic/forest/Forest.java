package forest;

public class Forest {

	// protected str is visible in child classes like Tree
	protected String str = "i'm protected string";

	public void hello() {
		System.out.println("i'm a forest");
	}
}
