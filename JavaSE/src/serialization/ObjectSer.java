package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSer {
	/**
	 * 对象的序列化
	 * 
	 * <pre>
	 * 对象的寿命通常是随着生成该对象的程序的终止而终止。有时候，可能需要将对象的状态保存下来，在需要时再将对象恢复。我们把对象的这种能记录自己的状态
	 * 以便将来再生的能力，叫作对象的持续性（persistence）。对象通过写出描述自己状体的数值来记录自己，这个过程叫对象的序列化（Serialization）
	 * 序列化的主要任务是写出对象实例变量的数值。如果变量是另一对象的引用，则引用的对象也要序列化。这个过程是递归的，序列化可能要涉及一个复杂树结构的单行化
	 * ，包括原有对象、对象的对象、对象的对象的对象等等。对象所有权的层次结构称为图表（graph）
	 * 序列化只能保存对象的非静态成员变量，不能保存任何的成员方法和静态的成员变量，而且序列化保存的只是变量的值，对于变量的任何修饰符都不能保存
	 * </pre>
	 */
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Student stu = new Student(981036, "LiuMing", 18, "CSD");
		FileOutputStream fo = new FileOutputStream("data.ser");
		ObjectOutputStream so = new ObjectOutputStream(fo);
		try {
			so.writeObject(stu);
			so.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		stu = null;
		FileInputStream fi = new FileInputStream("data.ser");
		ObjectInputStream si = new ObjectInputStream(fi);
		try {
			stu = (Student) si.readObject();
			si.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("Student Info:");
		System.out.println("ID:" + stu.id);
		System.out.println("Name:" + stu.name);
		System.out.println("Age:" + stu.age);
		System.out.println("Dep:" + stu.department);
	}
}
