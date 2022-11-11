package myAL;

import java.util.Arrays;

public class myAL {

	private int size = 1;
	private int filled = 0;
	private int[] arr = new int[size];

	public String toString() {
		return Arrays.toString(arr);
	}

	private void increaseArr() {
		int[] temp = arr;
		arr = Arrays.copyOf(temp, size * 2);
		size *= 2;
	}

	public void add(int item) {
		if (filled == size)
			increaseArr();
		arr[filled] = item;
		filled++;
	}

	public int get(int idx) {
		return (arr[idx]);
	}

	public void remove(int idx) {
		if (idx < filled) {
			for (int i = idx; i < filled - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[filled - 1] = 0;
			filled--;
		}
	}
}
