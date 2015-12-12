
public class GenericTest {
	public static void main(String[] args) {
		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		Box<Number> number = new Box<Number>(313);
		getData(name);
		getData(age);
		getData(number);

		// getUpperNumberData(name);
		getUpperNumberData(age);
		getUpperNumberData(number);

	}

	public static void getData(Box<?> data) {
		System.out.println("data:" + data.getData());
	}

	public static void getUpperNumberData(Box<? extends Number> data) {
		System.out.println("data:" + data.getData());
	}
}

class Box<T> {
	private T date;

	public Box() {

	}

	public Box(T data) {
		this.date = data;
	}

	public T getData() {
		return date;
	}
}