package thread;

/**
 * 消费者线程
 * 
 * @author WithMing
 * @date 2015年11月13日 上午11:18:24
 * @Title:Consumer
 */
public class Consumer extends Thread {
	Queue q;

	Consumer(Queue q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}
