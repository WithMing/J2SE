package designpattern.factoryMethod;

public class SendFactory {
	// 1.��ͨ����ģʽ-----------------------------start
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ������!");
			return null;
		}
	}

	// 2.�����������ģʽ--------------------------start
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}

	// 3.��̬��������ģʽ--------------------------start
	public static Sender produceMail1() {
		return new MailSender();
	}

	public static Sender produceSms1() {
		return new SmsSender();
	}
}
