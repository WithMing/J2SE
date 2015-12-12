import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		char n = 0;
		do {
			System.out.println("1.选择 1");
			System.out.println("2.选择 2");
			System.out.println("3.选择 3");
			System.out.println("4.选择 4");
			System.out.println("5.选择 5");
			System.out.println("请输入选择: ");
			n = (char) System.in.read();
			switch (n) {
			case '1':
				System.out.println("您选择了1");
				break;
			case '2':
				System.out.println("您选择了2");
				break;
			case '3':
				System.out.println("您选择了3");
				break;
			case '4':
				System.out.println("您选择了4");
				break;
			case '5':
				System.out.println("您选择了5");
				break;
			default:
				System.out.println("输入非法!");
				break;
			}
		} while (n < '1' || n > '5');
	}
}
