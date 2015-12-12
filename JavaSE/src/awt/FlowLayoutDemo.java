package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutDemo {
	public FlowLayoutDemo() {
		b1 = new Button("����");
		b2 = new Button("ȡ��");
		b3 = new Button("ȷ��");
	}

	public static void main(String[] args) {
		FlowLayoutDemo fl = new FlowLayoutDemo();
		fl.show();
	}

	public void show() {
		f = new Frame("FlowLayer˳�򲼾�");
		f.setSize(300, 200);
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
		f.add(b1);
		f.add(b2);
		f.add(b3);
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
	private Button b1, b2, b3;
}
