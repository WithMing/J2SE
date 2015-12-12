package thread;

/**
 * @author WithMing
 * @date 2015��11��12�� ����4:38:16
 * @Title:ShareData
 * @Description:���̲߳�ͬ���Ľ������--��
 */
class ShareData1 {
	public static String szData = "";
}

class ThreadDemo1 extends Thread {
	private ShareData1 oShare;

	ThreadDemo1() {

	}

	ThreadDemo1(String szName, ShareData1 oShare) {
		super(szName);
		this.oShare = oShare;
	}

	public void run() {
		synchronized (oShare) {
			for (int i = 0; i < 5; i++) {
				if (this.getName().equals("Thread1")) {
					oShare.szData = "���ǵ�1���߳�";
					try {
						Thread.sleep((int) Math.random() * 50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName() + ":" + oShare.szData);
				} else if (this.getName().equals("Thread2")) {
					oShare.szData = "���ǵ�2���߳�";
					try {
						Thread.sleep((int) Math.random() * 50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName() + ":" + oShare.szData);
				}
			}
		}
	}
}

public class ThreadSynchronized {
	public static void main(String[] args) {
		ShareData1 oShare = new ShareData1();
		ThreadDemo1 threadDemo1 = new ThreadDemo1("Thread1", oShare);
		ThreadDemo1 threadDemo2 = new ThreadDemo1("Thread2", oShare);
		threadDemo1.start();
		threadDemo2.start();
	}
}
