import java.util.Scanner;

public class TestScanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���:");
		while (true) {
			String text = sc.nextLine();
			if(text.equals("exit")) break;
			System.out.println(">>>"+text);
		}
	}
}
