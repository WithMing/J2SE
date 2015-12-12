package designpattern.singleton;

public class Singleton {
	/**
	 * ����ģʽ�ĺô��� 1.ĳЩ�ഴ���Ƚ�Ƶ��������һЩ���͵Ķ�������һ�ʺܴ��ϵͳ����
	 * 2.ʡȥ��new��������������ϵͳ�ڴ��ʹ��Ƶ�ʣ�����GCѹ��
	 * 3.��Щ���罻�����ĺ��Ľ������棬�����Ž������̣����������Դ�������Ļ���ϵͳ��ȫ���ˡ�
	 * ֻ��ʹ�õ���ģʽ�����ܱ�֤���Ľ��׷���������������������
	 */

	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton() {

	}

	/* �˴�ʹ��һ���ڲ�����ά������ */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/* ��̬���̷���������ʵ�� */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
	public Object readResolve() {
		return getInstance();
	}
}
