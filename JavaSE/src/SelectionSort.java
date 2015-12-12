
public class SelectionSort {
	public static void main(String[] args) {
		int[] intArray = { 12, 13, 43, 18, 57, 29, 36, 45, 9, 19, 21, 33 };
		System.out.print("选择排序前：");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
		int temp; // 记录最大或者最小值
		int index; // 记录最大或者最小值的位置
		for (int i = 0; i < intArray.length; i++) {
			temp = intArray[i];
			index = i;
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[j] > temp) {
					index = j;
					temp = intArray[j];
				}
				temp = intArray[i];
				intArray[i] = intArray[index];
				intArray[index] = temp;
			}
		}
		System.out.print("选择排序后：");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
