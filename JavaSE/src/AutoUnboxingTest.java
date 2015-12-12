
public class AutoUnboxingTest {
	public static void main(String[] args) {
		Integer a = new Integer(3);
		Integer b = 3; // 将3自动装箱成Integer类型
		int c = 3;
		Integer e = 3, f = 3;
		Integer g = new Integer(3);
		Integer h = 150, i = 150;
		System.out.println(a == b); // false 两个引用没有引用同一个对象
		System.out.println(a == c); // true a自动拆箱成int类型再和c比较
		System.out.println(e == f); // true
		System.out.println(a == g); // false
		System.out.println(h == i); // false
	}
}
