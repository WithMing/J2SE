import java.util.Scanner;

/**
 * 
 * @author WithMing Email:136326313@qq.com
 * @date 2015年11月5日 下午3:12:46
 * Title:TestScanner2
 * Description:
 */
public class TestScanner3 {
	/**
	 * Scaner默认使用空格作为分隔符来分割文本，但允许你指定新的分隔符,通过Scanner.useDelimiter来指定分隔符
	 * @author WithMing Email:136326313@qq.com
	 * @date 2015年11月5日 下午3:12:54
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
