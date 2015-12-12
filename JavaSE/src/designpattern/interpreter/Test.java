package designpattern.interpreter;

public class Test {
	/**
	 * 解释器模式
	 * 
	 * <pre>
	 *解释器模式主要应用在OOP开发中的编译器的开发，所以适用面比较窄。用来做各种各样的解释器，如正则表达式等的解释器等等。
	 * </pre>
	 */
	public static void main(String[] args) {
		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
