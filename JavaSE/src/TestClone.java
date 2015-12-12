
public class TestClone {
	public static void main(String[] args) {
		Addr addr = new Addr("中国", "江西", "赣州");
		Humen1 zhangsan = new Humen1("张三", "男", 21, addr);
		Humen1 lisi = (Humen1) zhangsan.clone();
		System.out.println("张三:" + zhangsan.getAddr().getCountry() + "," + zhangsan.getAddr().getProvince() + ","
				+ zhangsan.getAddr().getCity());
		System.out.println("李四:" + lisi.getAddr().getCountry() + "," + lisi.getAddr().getProvince() + ","
				+ lisi.getAddr().getCity());
		// Addr addr1 = new Addr("中国", "四川", "成都");
		// lisi.addr = addr1;
		lisi.getAddr().setCountry("中国");
		lisi.getAddr().setProvince("四川");
		lisi.getAddr().setCity("成都");
		System.out.println("张三:" + zhangsan.getAddr().getCountry() + "," + zhangsan.getAddr().getProvince() + ","
				+ zhangsan.getAddr().getCity());
		System.out.println("李四:" + lisi.getAddr().getCountry() + "," + lisi.getAddr().getProvince() + ","
				+ lisi.getAddr().getCity());
	}
}

class Addr implements Cloneable {
	private String country;
	private String province;
	private String city;

	Addr(String country, String province, String city) {
		this.country = country;
		this.province = province;
		this.city = city;
	}

	public Object clone() {
		Addr addr = null;
		try {
			addr = (Addr) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addr;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}

class Humen1 implements Cloneable {
	private String name;
	private String sex;
	private int age;
	private Addr addr;

	Humen1(String name, String sex, int age, Addr addr) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.addr = addr;
	}

	public Object clone() {
		Humen1 hm = null;
		try {
			hm = (Humen1) super.clone();
			hm.addr = (Addr) this.addr.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Addr getAddr() {
		return addr;
	}

	public void setAddr(Addr addr) {
		this.addr = addr;
	}

}