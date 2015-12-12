import java.io.IOException;

public class StandardInputOutput1 {
	public static void main(String[] args) {
		System.out.println("please input:");
		int b;
		try {
			while ((b = System.in.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
