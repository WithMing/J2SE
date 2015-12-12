package designpattern.facade;

public class Test {
	/**
	 * 外观模式
	 *<pre>
	 *外观模式是为了解决类与类之间的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系
	 *放在一个Facade类中，降低了类类之间的耦合度，该模式没有设计到接口。
	 *</pre>
	 */
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Memory memory = new Memory();
		Disk disk = new Disk();
		Computer computer = new Computer(cpu, memory, disk);
		computer.startup();
		computer.shutdown();
	}

}
