
public class BubbleSort {
	public static void main(String[] args) {
		int[] intArray = { 12, 13, 43, 18, 57, 29, 36, 45, 9, 19, 21, 33 };
		System.out.print("����ǰ��");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
		int temp; // ��¼��������Сֵ
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		System.out.print("�����");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
