package thread;

public class Queue {
	int value = 0; // ����������ʼ����������������value
	boolean isEmpty = true; // ����������ʼ����������������isEmpty�������ж϶��е�״̬

	// ��������������
	public synchronized void put(int v) {
		// �����������û�б������������ߵȴ�
		if (!isEmpty) {
			System.out.println("�����ߵȴ�....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		value += v; // valueֵ+v
		isEmpty = false;
		System.out.println("�����߹�����������" + v);
		notify(); // ����֮��֪ͨ����������
	}

	// ���������ѷ���
	public synchronized int get() {
		// ����ǰ��������������Ѿ��������꣬�������ߵȴ�
		if (isEmpty) {
			System.out.println("�����ߵȴ�....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value--;
		if (value < 1) {
			isEmpty = true;
		}
		System.out.println("����������һ����ʣ��:" + value);
		notify(); // ���������Ѻ�֪ͨ����������
		return value;
	}
}
