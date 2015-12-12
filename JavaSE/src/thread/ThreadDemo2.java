package thread;

public class ThreadDemo2 extends Thread {
	ThreadDemo2() {

	}

	ThreadDemo2(String szName) {
		super(szName);
	}

	public void run() {
		for (int count = 1, row = 1; row < 10; count++, row++) {
			for (int i = 0; i < count; i++) {
				System.out.print("public *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ThreadDemo2 thread1 = new ThreadDemo2();
		thread1.start();
		ThreadDemo2 thread2 = new ThreadDemo2();
		thread2.start();
		ThreadDemo2 thread3 = new ThreadDemo2();
		thread3.start();
	}
}
