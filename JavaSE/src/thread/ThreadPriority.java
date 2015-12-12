package thread;

/**
 * 
 * @author WithMing
 * @date 2015年11月12日 下午4:29:32
 * @Title:InheritThread
 * @Description:
 */
class InheritThread extends Thread {
	public void run() {
		System.out.println("InheritThread is running...");
		for (int i = 0; i < 10; i++) {
			System.out.println("InheritThread i=" + i);
			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class RunnableThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("RunnableThread is running ...");
		for (int i = 0; i < 10; i++) {
			System.out.println("RunnableThread i=" + i);
			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		InheritThread itd = new InheritThread();
		Thread rtd = new Thread(new RunnableThread());
		itd.setPriority(10);
		rtd.setPriority(1);
		itd.start();
		rtd.start();
	}
}
