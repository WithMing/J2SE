package thread;

/**
 * �������߳�
 * 
 * @author WithMing
 * @date 2015��11��13�� ����11:18:24
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
