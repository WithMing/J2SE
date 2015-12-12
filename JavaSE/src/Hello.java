class A1 {

	static {
		System.out.print("1");
	}

	public A1() {
		System.out.print("2");
	}
}

class B1 extends A1 {
	static {
		System.out.print("a");
	}

	public B1() {
		System.out.print("b");
	}
}

public class Hello {
	public static void main(String[] args) {
		A1 ab = new B1();
		ab = new B1();
	}
}
