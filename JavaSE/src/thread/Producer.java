package thread;

/**
 * 生产者线程
 * 
 * @author WithMing
 * @date 2015年11月13日 上午9:03:54
 * @Title:Producer
 */
public class Producer extends Thread {
	Queue q;

	Producer(Queue q) {
		this.q = q;
	}

	public void run() {
		for (int i = 1; i < 5; i++) {
			q.put(i);
		}
	}
}
