
public final class CallConstructor2 {
	String value1="";
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C(1);
	}
}

class A {
	public A() {
		System.out.println("�����޲εĹ��캯��A");
	}

	public A(int i) {
		System.out.println("�����вεĹ��캯��A");
	}
}

class B extends A {
	public B() {
		System.out.println("�����޲εĹ��캯��B");
	}

	public B(int i) {
		super(i);
		System.out.println("�����вεĹ��캯��B");
	}
}

class C extends B {
	public C() {
		System.out.println("�����޲εĹ��캯��C");
	}

	public C(int i) {
		super(i);
		System.out.println("�����вεĹ��캯��C");
	}
}
