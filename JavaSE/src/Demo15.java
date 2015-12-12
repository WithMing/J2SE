/**
 * @author WithMing Email:136326313@qq.com
 * @date 2015年10月9日 下午8:54:32 Title:Demo15 Description:
 */
public class Demo15 {
	public static void main(String[] args) {
		// 用out标记外边的for语句块
		out: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j >= i) {
					System.out.println();
					// 用continue跳出当前循环，执行外循环
					continue out;
				} else
					System.out.print(" i=" + i + " j=" + j);
			}
		}
	}
}
