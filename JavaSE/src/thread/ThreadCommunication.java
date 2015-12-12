package thread;

/**
 * 多线程之间的通信
 * 
 * @author WithMing
 * @date 2015年11月13日 上午11:22:11
 * @Title:ThreadCommunication
 */
public class ThreadCommunication {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
	}

}
