package designpattern.Builder;

public class Test {
	/**
	 * ������ģʽ
	 *<pre>
	 * ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й���
	 * �������������϶�����ν���϶������ָĳ������в�ͬ�����ԡ�����ģʽ��ע���Ǵ�
	 * ��������Ʒ����������ģʽ���ע�������϶��󣬶�����֡�
	 *</pre>
	 */
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
