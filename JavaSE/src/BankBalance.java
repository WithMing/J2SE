
public class BankBalance {
	public static void main(String[] args) {
		// ��һ��һά��������ʾ����
		double rate[] = { 5.00 / 100, 5.50 / 100, 6.00 / 100, 6.50 / 100 };
		// ��ʾ�˵��Ķ�ά����
		int[][] balance = new int[10][4];
		// Title
		for (int i = 0; i < balance[0].length; i++)
			balance[0][i] = 1000;
		// �����˵���ֵ
		for (int i = 1; i < balance.length; i++)
			for (int j = 0; j < rate.length; j++) {
				double inc = balance[i - 1][j] * rate[j];
				balance[i][j] = (int) (balance[i - 1][j] + inc);
			}

		System.out.print("years  ");
		System.out.println("5.00%" + " " + "5.50%" + " " + "6.00%" + " " + "6.50%");
		for (int i = 0; i < balance.length; i++) {
			System.out.print("  "+i+"    ");
			for (int j = 0; j < balance[i].length; j++)
				System.out.print(balance[i][j]+"  ");
			System.out.println();
		}
	}
}
