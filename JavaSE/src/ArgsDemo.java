
public class ArgsDemo {
	public static void main(String[] args) {
		System.out.println("共接收了" + args.length + "个参数！");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
