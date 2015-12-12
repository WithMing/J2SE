
public class Test {
	public static void main(String[] args) {
		int[][] twoD = new int[5][5];
		int start = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				twoD[i][j] = start;
				start++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}
	}
}
