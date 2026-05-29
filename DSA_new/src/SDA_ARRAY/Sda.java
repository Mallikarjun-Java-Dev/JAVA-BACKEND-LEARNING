package SDA_ARRAY;

public class Sda {
	int[] arr;

	Sda(int size) {
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// insert value in array
	public void insert(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("value id added successfully");
			} else {
				System.out.println("cell is already filled");
			}
		} catch (Exception e) {
			System.out.println("invalid index");
		}
	}

	// access value from array
	public void traverse() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void search(int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value)
				System.out.println("value is present at index:" + i);
		}
	}

	public static void main(String[] args) {
		Sda s = new Sda(4);
		s.insert(0, 1);
	}
}
