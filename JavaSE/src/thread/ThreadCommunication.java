package thread;

/**
 * ���߳�֮���ͨ��
 * 
 * @author WithMing
 * @date 2015��11��13�� ����11:22:11
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
