public class Arrays {
	public static void main(String[] args) {

		int[] arr0 = new int[5];
		System.out.println(arr0[0]);

		for (int i = 0; i < arr0.length; i++) {
			arr0[i] = i + 1;
			System.out.println(arr0[i]);
		}

		int[] arr1 = { 5, 4, 3, 2, 1 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		int[][] arr_mult = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7 },
				{ 8, 9 },
		};

		for (int i = 0; i < arr_mult.length; i++) {
			for (int j = 0; j < arr_mult[i].length; j++) {
				System.out.print(arr_mult[i][j] + " ");
			}
			System.out.println();
		}

		// use class from other file
		Person per = new Person();
		System.out.println(per.getName());
	}
}
