package designpattern.Builder;

public class SmsSender implements Sender {
	public void send() {
		System.out.println("this is sms sender!");
	}
}
