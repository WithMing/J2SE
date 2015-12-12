package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {
	public BorderLayoutDemo() {
		b1 = new Button("�ϱ�");
		b2 = new Button("����");
		b3 = new Button("����");
		b4 = new Button("�Ҷ�");
		b5 = new Button("�м�");
	}

	public static void main(String[] args) {
		BorderLayoutDemo fl = new BorderLayoutDemo();
		fl.show();
	}

	public void show() {
		f = new Frame("BoderLayer(�߽粼��)��ʾ");
		f.setSize(300, 200);
		f.setLayout(new BorderLayout());
		f.add(BorderLayout.NORTH, b1);
		f.add(BorderLayout.SOUTH, b2);
		f.add(BorderLayout.WEST, b3);
		f.add(BorderLayout.EAST, b4);
		f.add(BorderLayout.CENTER, b5);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.setVisible(false);
				f.dispose(); // �ͷŴ��ڼ������齨����Ļ��Դ
				System.exit(0);
			}
		});
		f.setVisible(true);
	}

	class Mywindowadapter extends WindowAdapter {
		public void windowCloseing(WindowEvent we) {
			System.exit(0);
		}
	}

	private Frame f;
	private Button b1, b2, b3, b4, b5;
}
