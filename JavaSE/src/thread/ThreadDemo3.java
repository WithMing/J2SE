package thread;

public class ThreadDemo3 implements Runnable {
	public void run() {
		for (int count = 1, row = 1; row < 10; row++, count++) {
			for (int i = 0; i < count; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Runnable thread = new ThreadDemo3();
		Thread td = new Thread(thread);
		td.start();
		Runnable thread1 = new ThreadDemo3();
		Thread td1 = new Thread(thread1);
		td1.start();
		Runnable thread2 = new ThreadDemo3();
		Thread td2 = new Thread(thread2);
		td2.start();
	}
}