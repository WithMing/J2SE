package sort;

public class insertSort {
	public static void main(String[] args) {
		int[] arr = { 12, 21, 15, 13, 11, 23 };
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (j >arr.length) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
