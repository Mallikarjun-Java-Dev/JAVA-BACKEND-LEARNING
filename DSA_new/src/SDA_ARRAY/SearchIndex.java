package SDA_ARRAY;

//Write a program to search the value at given index in an array.
public class SearchIndex {
	String[] arr = { "hi", "hello", "how", "how", "you" };

	public void searchValue(int index) {
		try {
			if (arr[index] != null) {
				System.out.println("the value at index " + index + " is: " + arr[index]);
			} else {
				System.out.println("cell is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}

	public static void main(String[] args) {
		SearchIndex s = new SearchIndex();
		s.searchValue(2);
	}
}
