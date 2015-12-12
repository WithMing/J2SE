import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WithMing Email:136326313@qq.com
 * @date 2015年10月10日 下午2:52:22 Title:RingDemo Description:螺旋矩阵
 */
public class RingDemo {
	public static void main(String[] args) {
		/**
		 * 螺旋矩阵
		 * 找出规律，通过数组来实现
		 */
		String strIn = "";
		System.out.println("请输入矩阵的行列数");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		try {
			strIn = br.readLine();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		int n = Integer.parseInt(strIn);
		System.out.println("这是行列数为" + n + "的矩阵:");
		int[][] array = new int[n][n];
		int intA = 1;
		int intB;
		if (n % 2 != 0)
			intB = n / 2 + 1; // 奇数的循环次数
		else
			intB = n / 2;
		for (int i = 0; i < intB; i++) {
			// 从左到右
			for (int j = i; j < n - i; j++) {
				array[i][j] = intA;
				intA++;
			}
			// 从上到下
			for (int k = i + 1; k < n - i; k++) {
				array[k][n - i - 1] = intA;
				intA++;
			}
			// 从右到左
			for (int l = n - i - 2; l >= i; l--) {
				array[n - i - 1][l] = intA;
				intA++;
			}
			// 从下到上
			for (int m = n - i - 2; m > i; m--) {
				array[m][i] = intA;
				intA++;
			}
		}

		// 输出数组
		int maxValue = array[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
				}
			}
		}
		int length = Integer.toString(maxValue).length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				String strA = Integer.toString(array[i][j]);
				int lengthA = strA.length();
				if (lengthA < length) {
					int intF = length - lengthA;
					for (int k = 0; k < intF; k++) {
						strA = "0" + strA;
					}
				}
				System.out.print(strA + " ");
			}
			System.out.println();
		}
	}
}
