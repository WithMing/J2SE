import java.util.Vector;

/**
 * ArrayList会比Vector快，他是非同步的，如果涉及到多线程，还是用Vector比较好一些,Vector可实现自动增长的对象数组
 * java.util.vector提供了向量类（vector）以实现类似动态数组的功能。在Java语言中没有指针的概念，但如果正确灵活地使用指针又
 * 确实可以大大提高程序的质量。比如在c,c++中所谓的“动态数组”一般都由指针来实现。为了弥补这个缺点，Java提供了丰富的类库来方便编程者
 * 使用，vector类便是其中之一。事实上，灵活使用数组也可以完成向量类的功能，但向量类中提供大量的方法大大方便了用户的使用。创建了一个
 * 向量类的对象后，可以往其中随意插入不同类的对象，即不需顾及类型也不需预先选定向量的容量，并可以方便地进行查找。对于预先不知或者不愿
 * 预先定义数组大小，并且需要频繁地进行查找，插入，删除工作的情况。可以考虑使用向量类。
 * 
 * @author WithMing
 * @date 2015年11月23日 上午9:05:32
 * @Title:Vector
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(4);
		v.add("Test0");
		v.add("Test1");
		v.add("Test0");
		v.add("Test2");
		v.add("Test2");
		v.remove("Test0");
		v.remove(3);
		System.out.println(v.size());
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}
