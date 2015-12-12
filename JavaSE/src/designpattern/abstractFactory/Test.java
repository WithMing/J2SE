package designpattern.abstractFactory;

public class Test {
	/**
	 * ���󹤳�ģʽ
	 * <pre>
	 * ��������ģʽ��һ��������ǣ���Ĵ������������࣬Ҳ����˵�������Ҫ��չ���򣬱���Թ���������޸ģ�
	 * ����Υ���˱հ�ԭ�����ԣ�����ƵĽǶȿ��ǣ���һ�������⣬��ν�������õ����󹤳�ģʽ���������
	 * �����࣬����һ����Ҫ�����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�����Ҫ�޸�֮ǰ�Ĵ��롣�����������
	 * ����һ�����ܣ�����ʱ��Ϣ����ֻ��Ҫ��һ��ʵ���࣬ʵ��Sender�ӿڣ�ͬʱ��һ�������࣬ʵ��
	 * Provider�ӿڣ���OK�ˣ�����ȥ�Ķ��ֳɵĴ��롣����������չ�ԱȽϺã�
	 * </pre>
	 */
	public static void main(String[] args) {
		Provider provider = new SendSmsFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
