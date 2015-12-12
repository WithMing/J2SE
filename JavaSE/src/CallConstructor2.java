
public final class CallConstructor2 {
	String value1="";
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C(1);
	}
}

class A {
	public A() {
		System.out.println("调用无参的构造函数A");
	}

	public A(int i) {
		System.out.println("调用有参的构造函数A");
	}
}

class B extends A {
	public B() {
		System.out.println("调用无参的构造函数B");
	}

	public B(int i) {
		super(i);
		System.out.println("调用有参的构造函数B");
	}
}

class C extends B {
	public C() {
		System.out.println("调用无参的构造函数C");
	}

	public C(int i) {
		super(i);
		System.out.println("调用有参的构造函数C");
	}
}
