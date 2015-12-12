package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDemo extends Frame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CardLayoutDemo(String string) {
		super(string);
		init();
	}

	public static void main(String[] args) {
		new CardLayoutDemo("CradLayer");
	}

	public void init() {
		setLayout(new BorderLayout());
		setSize(400, 300);
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		first.addMouseListener(this);
		second.addMouseListener(this);
		third.addMouseListener(this);
		p.add(first);
		p.add(second);
		p.add(third);
		add("North", p);
		cards.setLayout(cl);
		cards.add("First Card", new Button("第一页内容"));
		cards.add("Second Card", new Button("第二页内容"));
		cards.add("Third Card", new Button("第三页内容"));
		add("Center", cards);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose(); // 释放窗口及其子组建的屏幕资源
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public void mouseClicked(java.awt.event.MouseEvent e) {
		if (e.getSource() == first) {
			cl.first(cards);
		} else if (e.getSource() == second) {
			cl.first(cards);
			cl.next(cards);
		} else if (e.getSource() == third) {
			cl.last(cards);
		}
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
	}

	private Button first = new Button("第一页");
	private Button second = new Button("第二页");
	private Button third = new Button("第三页");
	private Panel cards = new Panel();
	private CardLayout cl = new CardLayout();

}
