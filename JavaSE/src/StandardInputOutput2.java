import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputOutput2 {
	public static void main(String[] args) {
		String s;
		// �����������Ķ����Ӽ������ж�������
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Unixϵͳ: ctrl-d �� ctrl-c �˳�"
				+ "\nWindowsϵͳ: ctrl-z �˳�");
		try {
			// ��һ�����ݣ�����׼�������ʾ��
			s = in.readLine();
			// readLine()��������ʱ������I/O���󣬽��׳�IOException�쳣
			while (s != null) {
				System.out.println("Read:" + s);
				s = in.readLine();
			}
			// �رջ����Ķ���
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
