package thread;

/**
 * @author WithMing
 * @date 2015年11月12日 下午4:38:16
 * @Title:ShareData
 * @Description:多线程不同步的原因
 */
class ShareData {
	public static String szData = "";
}

class ThreadDemo extends Thread {
	private ShareData oShare;

	ThreadDemo() {

	}

	ThreadDemo(String szName, ShareData oShare) {
		super(szName);
		this.oShare = oShare;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			if (this.getName().equals("Thread1")) {
				oShare.szData = "这是第1个线程";
				try {
					Thread.sleep((int) Math.random() * 100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(this.getName() + ":" + oShare.szData);
			} else if (this.getName().equals("Thread2")) {
				oShare.szData = "这是第2个线程";
				try {
					Thread.sleep((int) Math.random() * 100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(this.getName() + ":" + oShare.szData);
			}
		}
	}
}

public class ThreadNoSynchronized {
	public static void main(String[] args) {
		ShareData oShare = new ShareData();
		ThreadDemo threadDemo1 = new ThreadDemo("Thread1", oShare);
		ThreadDemo threadDemo2 = new ThreadDemo("Thread2", oShare);
		threadDemo1.start();
		threadDemo2.start();
	}
}
