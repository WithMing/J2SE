/**
 * @author WithMing Email:136326313@qq.com
 * @date 2015��10��9�� ����8:54:32 Title:Demo15 Description:
 */
public class Demo15 {
	public static void main(String[] args) {
		// ��out�����ߵ�for����
		out: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j >= i) {
					System.out.println();
					// ��continue������ǰѭ����ִ����ѭ��
					continue out;
				} else
					System.out.print(" i=" + i + " j=" + j);
			}
		}
	}
}
