package designpattern.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer(CPU cpu, Memory memory, Disk disk) {
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}

	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("computer start finished!");
	}

	public void shutdown() {
		System.out.println("shutdown the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("computer shutdown finished!");
	}
}
