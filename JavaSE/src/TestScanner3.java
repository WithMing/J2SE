import java.util.Scanner;

/**
 * 
 * @author WithMing Email:136326313@qq.com
 * @date 2015��11��5�� ����3:12:46
 * Title:TestScanner2
 * Description:
 */
public class TestScanner3 {
	/**
	 * ScanerĬ��ʹ�ÿո���Ϊ�ָ������ָ��ı�����������ָ���µķָ���,ͨ��Scanner.useDelimiter��ָ���ָ���
	 * @author WithMing Email:136326313@qq.com
	 * @date 2015��11��5�� ����3:12:54
	 * Description:
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner("dsfds fsdfsd dfad,fa.sdf dsf dasdf adf");
		sc.useDelimiter(" |,|\\.");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}
