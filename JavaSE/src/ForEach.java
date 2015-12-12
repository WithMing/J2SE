
public class ForEach {
	public static void main(String[] args) {
		int sum = 0;
		int[][] nums = new int[4][4];
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = k;
				k++;
			}
		}

		for (int x[] : nums) {
			for (int y : x) {
				System.out.println("数组元素：" + y);
				sum += y;
			}
		}
		System.out.println("数组元素和：" + sum);
	}
}
