package designpattern.proxy;

public class Test {
	/**
	 * 代理模式
	 * 
	 * <pre>
	 *其实每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，替原对象进行一些操作，
	 *代理模式的应用场景：
	 *1.修改原有的方法来适应。这样违反了"对扩展开放，对修改关闭"的原则
	 *2.就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。使用代理模式，可以将
	 *功能划分的更加清晰，有助于后期维护
	 * </pre>
	 */
	public static void main(String[] args) {
		Source source = new Source();
		Sourceable proxy = new Proxy(source);
		proxy.method();
	}

}
