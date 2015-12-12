import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WithMing Email:136326313@qq.com
 * @date 2015��10��10�� ����2:52:22 Title:RingDemo Description:��������
 */
public class RingDemo {
	public static void main(String[] args) {
		/**
		 * ��������
		 * �ҳ����ɣ�ͨ��������ʵ��
		 */
		String strIn = "";
		System.out.println("����������������");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		try {
			strIn = br.readLine();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		int n = Integer.parseInt(strIn);
		System.out.println("����������Ϊ" + n + "�ľ���:");
		int[][] array = new int[n][n];
		int intA = 1;
		int intB;
		if (n % 2 != 0)
			intB = n / 2 + 1; // ������ѭ������
		else
			intB = n / 2;
		for (int i = 0; i < intB; i++) {
			// ������
			for (int j = i; j < n - i; j++) {
				array[i][j] = intA;
				intA++;
			}
			// ���ϵ���
			for (int k = i + 1; k < n - i; k++) {
				array[k][n - i - 1] = intA;
				intA++;
			}
			// ���ҵ���
			for (int l = n - i - 2; l >= i; l--) {
				array[n - i - 1][l] = intA;
				intA++;
			}
			// ���µ���
			for (int m = n - i - 2; m > i; m--) {
				array[m][i] = intA;
				intA++;
			}
		}

		// �������
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
