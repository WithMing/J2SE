package thread;

public class ThreadLocked implements Runnable {
	public static boolean flag = true;
	private static Object A = new Object();
	private static Object B = new Object();

	public void AccessA() {
		flag = false;
		synchronized (A) {
			System.out.println("�߳�T1���ҵõ���A����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�߳�T1���һ���õ�B����");
			synchronized (B) {
				System.out.println("�߳�T1���ҵõ�B����");
			}
		}
	}

	public void AccessB() {
		flag = true;
		synchronized (B) {
			System.out.println("�߳�T2���ҵõ���B����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�߳�T2���һ���õ�A����");
			synchronized (A) {
				System.out.println("�߳�T2���ҵõ�A����");
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			AccessA();
		} else {
			AccessB();
		}

	}

	public static void main(String[] args) {
		Thread td1 = new Thread(new ThreadLocked());
		Thread td2 = new Thread(new ThreadLocked());
		td1.start();
		td2.start();
	}
}
