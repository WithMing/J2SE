
public class Humen implements Cloneable {
	String name;
	String sex;
	int age;
	String addr;

	Humen(String name, String sex, int age, String addr) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.addr = addr;
	}

	void work() {
		System.out.println("我在工作!");
	}

	void eat() {
		System.out.println("我在吃饭!");
	}

	public Object clone() {
		Humen h = null;
		try {
			h = (Humen) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;
	}

	public static void main(String[] args) {
		Humen zhangsan = new Humen("张三", "男", 29, "赣州");
		Humen lisi = (Humen) zhangsan.clone();
		lisi.name = "李四";
		System.out.println(zhangsan.name);
		System.out.println(lisi.name);
	}
}
