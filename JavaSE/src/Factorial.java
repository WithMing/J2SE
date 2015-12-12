public class Factorial {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 1; i <= 20; i++) {
			int curr = 1;
			for (int y = 1; y <= i; y++) {
				curr = curr * y;
			}
			sum += curr;
		}
		System.out.println(sum);
	}
}