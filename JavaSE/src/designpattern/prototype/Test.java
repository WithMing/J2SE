package designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {
	/**
	 * 
	 */

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Address addr = new Address("中国", "江西", "赣州");
		Student stu = new Student("张三", "男", addr);
		System.out.println("浅克隆 -----------start");
		Student stu1 = (Student) stu.clone();
		System.out.println(stu1.name + "," + stu1.addr.country + "," + stu1.addr.province + "," + stu1.addr.city);
		stu1.name = "李四";
		stu1.addr.country = "中国";
		stu1.addr.province = "四川";
		stu1.addr.city = "成都";
		// 浅克隆后，克隆得到的对象的值发生改变时，原对象的值也发生改变，说明浅克隆对引用对象只是从新生成了对对象的引用
		System.out.println("改变浅克隆对象的值后：");
		System.out.println(stu1.name + "," + stu1.addr.country + "," + stu1.addr.province + "," + stu1.addr.city);
		System.out.println(stu.name + "," + stu.addr.country + "," + stu.addr.province + "," + stu.addr.city);
		System.out.println("深克隆 -----------start");
		Student stu2 = (Student) stu.deepClone();
		System.out.println("改变前：");
		System.out.println(stu2.name + "," + stu2.addr.country + "," + stu2.addr.province + "," + stu2.addr.city);
		stu2.name = "李四";
		stu2.addr.country = "中国";
		stu2.addr.province = "四川";
		stu2.addr.city = "成都";
		System.out.println("改变深克隆对象的值后：");
		System.out.println(stu.name + "," + stu.addr.country + "," + stu.addr.province + "," + stu.addr.city);
		System.out.println(stu2.name + "," + stu2.addr.country + "," + stu2.addr.province + "," + stu2.addr.city);
	}
}

class Student implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String sex;
	Address addr;

	public Student(String name, String sex, Address addr) {
		this.name = name;
		this.sex = sex;
		this.addr = addr;
	}

	public Object clone() throws CloneNotSupportedException {
		Student stu = (Student) super.clone();
		return stu;
	}

	public Object deepClone() throws IOException, ClassNotFoundException {
		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}

class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String country;
	String province;
	String city;

	public Address(String country, String province, String city) {
		this.country = country;
		this.province = province;
		this.city = city;
	}
}
