import java.util.Scanner;

public class AverageTemperatures {
	public static void main(String[] args) {
		int count;
		double next, sum, average;
		sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������������¶�:");
		for (count = 0; count < 7; count++) {
			// ͨ��Scanner�������û�����
			next = sc.nextDouble();
			sum += next;
		}
		System.out.println(sum);
		average = sum / 7;
		System.out.println("�����ƽ���¶�Ϊ��" + average);
	}
}
