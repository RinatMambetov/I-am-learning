import forest.Forest;
import forest.trees.*;

public class Packages {
	public static void main(String[] args) {

		Forest forest = new Forest();
		forest.hello();

		Tree tree = new Tree();
		tree.hello();
		tree.printProtectStr();
	}
}
