/**
 * @author WithMing Email:136326313@qq.com
 * @date 2015��10��10�� ����2:50:05 Title:Print99 Description:�˷��ھ���
 */
public class Print99 {
	public static void main(String[] args) {
		System.out.println("99 �˷���");
		System.out.print("  ");
		// ���ȴ�ӡ����һ��1-9
		for (int i = 1; i <= 9; i++)
			System.out.print(i + " ");
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			// ÿһ�д�ӡ����ǰ�ǵڼ���
			System.out.print(i + " ");
			for (int j = 1; j <= 9; j++)
				if (j <= i)
					// ��ӡ��������
					System.out.print(i * j + " ");
			// ÿִ����һ�θ�ѭ������
			System.out.println();
		}
	}
}