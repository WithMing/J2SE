package designpattern.factoryMethod;

public class Test {
	/**
	 * 工厂方法模式的使用： 1.创建接口 2.创建实现类 3.建工厂类 4.测试
	 * 
	 * <pre>
	 * 工厂模式分：
	 * 1.普通工程模式
	 * 2.多个工厂方法模式:是对普通工厂模式的改进，在普通工厂模式中，如果传入的字符串出错，则不能正确的
	 *   创建对象，而多个工厂方法模式提供多个工厂方法，分别创建对象
	 * 3.静态工程模式:将多个工厂方法模式中的方法设置为static,不需要创建实例，直接调用即可
	 * </pre>
	 */
	public static void main(String[] args) {
		// 1.普通工厂模式-----------------------------start
		SendFactory factory = new SendFactory();
		Sender ms = factory.produce("mail");
		ms.send();
		// 2.多个工厂方法模式---------------------------start
		SendFactory factory1 = new SendFactory();
		Sender ms1 = factory1.produceSms();
		ms1.send();
		// 3.静态工厂方法模式
		Sender ms2 = SendFactory.produceMail1();
		ms2.send();
	}
}
