package designpattern.factoryMethod;

public class Test {
	/**
	 * ��������ģʽ��ʹ�ã� 1.�����ӿ� 2.����ʵ���� 3.�������� 4.����
	 * 
	 * <pre>
	 * ����ģʽ�֣�
	 * 1.��ͨ����ģʽ
	 * 2.�����������ģʽ:�Ƕ���ͨ����ģʽ�ĸĽ�������ͨ����ģʽ�У����������ַ�������������ȷ��
	 *   �������󣬶������������ģʽ�ṩ��������������ֱ𴴽�����
	 * 3.��̬����ģʽ:�������������ģʽ�еķ�������Ϊstatic,����Ҫ����ʵ����ֱ�ӵ��ü���
	 * </pre>
	 */
	public static void main(String[] args) {
		// 1.��ͨ����ģʽ-----------------------------start
		SendFactory factory = new SendFactory();
		Sender ms = factory.produce("mail");
		ms.send();
		// 2.�����������ģʽ---------------------------start
		SendFactory factory1 = new SendFactory();
		Sender ms1 = factory1.produceSms();
		ms1.send();
		// 3.��̬��������ģʽ
		Sender ms2 = SendFactory.produceMail1();
		ms2.send();
	}
}
