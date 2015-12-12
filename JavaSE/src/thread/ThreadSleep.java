package thread;

public class ThreadSleep extends Thread {
	public static void main(String[] args) {
		SubThread thread1 = new SubThread("线程1");
		thread1.start();
		while (thread1.isAlive()) {
			try {
				// Thread.sleep(100);
				thread1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SubThread thread2 = new SubThread("线程2");
		thread2.start();
		while (thread2.isAlive()) {
			try {
				// Thread.sleep(100);
				thread2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SubThread thread3 = new SubThread("线程3");
		thread3.start();
	}
}

class SubThread extends Thread {
	SubThread() {

	}

	SubThread(String szName) {
		super(szName);
	}

	public void run() {
		for (int count = 1, row = 1; row < 10; count++, row++) {
			for (int i = 0; i < count; i++) {
				System.out.print("*");
			}
			try {
				Thread.sleep(1000);
				System.out.print(Thread.currentThread().getName());
				System.out.print("\t....wait");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
	}

}