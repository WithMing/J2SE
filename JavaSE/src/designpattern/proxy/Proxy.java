package designpattern.proxy;

public class Proxy implements Sourceable {
	private Source source;

	public Proxy(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();

	}

	private void before() {
		System.out.println("before proxy");
	}

	private void after() {
		System.out.println("after proxy");
	}
}
