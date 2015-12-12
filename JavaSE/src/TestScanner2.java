import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream in = new FileInputStream("D:\\TestScanner2.java");
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
