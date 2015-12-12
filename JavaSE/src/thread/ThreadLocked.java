package thread;

public class ThreadLocked implements Runnable {
	public static boolean flag = true;
	private static Object A = new Object();
	private static Object B = new Object();

	public void AccessA() {
		flag = false;
		synchronized (A) {
			System.out.println("线程T1：我得到了A的锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("线程T1：我还想得到B的锁");
			synchronized (B) {
				System.out.println("线程T1：我得到B的锁");
			}
		}
	}

	public void AccessB() {
		flag = true;
		synchronized (B) {
			System.out.println("线程T2：我得到了B的锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("线程T2：我还想得到A的锁");
			synchronized (A) {
				System.out.println("线程T2：我得到A的锁");
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
