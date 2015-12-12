import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ����JDK��ջ�Ͷ���
 * 
 * @author WithMing
 * @date 2015��11��13�� ����9:25:58
 * @Title:TestQueueAndStack
 */
public class TestQueueAndStack {
	/**
	 * ���Զ���
	 * 
	 * <pre>
	 *  �����ص㣬�Ƚ��ȳ������������𳵹�ɽ�����ص�
	 * </pre>
	 */
	static void testQueue() {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("5");
		System.out.println("�����е�Ԫ����:" + queue);
		// ����Ԫ��
		queue.poll();
		System.out.println("�����е�Ԫ����:" + queue);
		// �鿴�������׸�Ԫ�أ������Ƴ�
		String peek = (String) queue.peek();
		System.out.println("�鿴�������׸�Ԫ�أ������Ƴ�:" + peek);
		System.out.println("�����е�Ԫ����:" + queue);
	}

	/**
	 * ����ջ
	 * 
	 * <pre>
	 * ջ�ض����Ƚ����������ȳ���ˮͰ��ˮ
	 * </pre>
	 */
	static void testStack() {
		Stack<String> stack = new Stack<String>();
		// ��Ӽ���Ԫ��
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.add("1");
		stack.add("2");
		stack.add("3");
		stack.add("4");
		stack.add("5");
		System.out.println("ջ�е�Ԫ����:" + stack);
		// ����Ԫ��
		stack.pop();
		System.out.println("ջ�е�Ԫ����:" + stack);
		// �鿴ջ���׸�Ԫ�أ������Ƴ�
		String peek = stack.peek();
		System.out.println("�鿴ջ���׸�Ԫ�أ������Ƴ�:" + peek);
		System.out.println("ջ�е�Ԫ����:" + stack);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-------����--------");
		testQueue();
		System.out.println("-------ջ--------");
		testStack();
	}

}
