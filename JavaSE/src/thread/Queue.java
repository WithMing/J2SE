package thread;

public class Queue {
	int value = 0; // 声明，并初始化整数类型数据域value
	boolean isEmpty = true; // 声明，并初始化布尔类型数据域isEmpty，用于判断队列的状态

	// 生产者生产方法
	public synchronized void put(int v) {
		// 如果共享数据没有被消费则生产者等待
		if (!isEmpty) {
			System.out.println("生产者等待....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		value += v; // value值+v
		isEmpty = false;
		System.out.println("生产者共生产数量：" + v);
		notify(); // 生产之后通知消费者消费
	}

	// 消费者消费方法
	public synchronized int get() {
		// 消费前，如果共享数据已经被消费完，则消费者等待
		if (isEmpty) {
			System.out.println("消费者等待....");
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
		System.out.println("消费者消费一个，剩余:" + value);
		notify(); // 消费者消费后，通知生产者生产
		return value;
	}
}
