package designpattern.factoryMethod;

public class SendFactory {
	// 1.普通工厂模式-----------------------------start
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}

	// 2.多个工厂方法模式--------------------------start
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}

	// 3.静态工厂方法模式--------------------------start
	public static Sender produceMail1() {
		return new MailSender();
	}

	public static Sender produceSms1() {
		return new SmsSender();
	}
}
