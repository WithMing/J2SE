package designpattern.singleton;

public class Singleton {
	/**
	 * 单列模式的好处： 1.某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销
	 * 2.省去了new操作符，降低了系统内存的使用频率，减轻GC压力
	 * 3.有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
	 * 只有使用单例模式，才能保证核心交易服务器独立控制整个流程
	 */

	/* 私有构造方法，防止被实例化 */
	private Singleton() {

	}

	/* 此处使用一个内部类来维护单例 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/* 静态工程方法，创建实例 */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}
}
