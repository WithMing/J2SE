package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {
	public BorderLayoutDemo() {
		b1 = new Button("上北");
		b2 = new Button("下南");
		b3 = new Button("左西");
		b4 = new Button("右东");
		b5 = new Button("中间");
	}

	public static void main(String[] args) {
		BorderLayoutDemo fl = new BorderLayoutDemo();
		fl.show();
	}

	public void show() {
		f = new Frame("BoderLayer(边界布局)演示");
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
				f.dispose(); // 释放窗口及其子组建的屏幕资源
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
