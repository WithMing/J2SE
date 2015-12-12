package awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameaddedPanel extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameaddedPanel(String string) {
		super(string);
	}

	public static void main(String[] args) {
		FrameaddedPanel f = new FrameaddedPanel("在Frame中添加Panel");
		Panel p = new Panel();
		f.setSize(300, 200);
		f.setBackground(Color.blue);
		f.setLayout(null); // 取消布局管理器
		p.setSize(100, 100);
		p.setBackground(Color.red);
		f.add(p);
		f.setVisible(true);
		f.addWindowListener(f.new Mywindowadapter());
	}

	class Mywindowadapter extends WindowAdapter {
		public void windowCloseing(WindowEvent we) {
			System.exit(0);
		}
	}
}
