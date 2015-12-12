import java.io.File;

public class TestFile {
	public static void main(String[] args) throws Throwable {
		File dir = new File("D:\\Div");
		File file1 = new File(dir,"Hello.java");
		File file2 = new File(dir,"Hello.txt");
		if (!dir.exists())
			dir.mkdir();
		if (!file1.exists())
			file1.createNewFile();
		if (!file2.exists())
			file2.createNewFile();
		System.out.println("file1's AbsolutePath:" + file1.getAbsolutePath());
		System.out.println("file1's canRead:" + file1.canRead());
		System.out.println("file1's length:" + file1.length());
		String[] FL;
		int count = 0;
		FL = dir.list();
		for (int i = 0; i < FL.length; i++) {
			 count++;  
			 System.out.println(FL[i]+" is in D:\\Div");
		}
		System.out.println("There are "+count+" file in D:\\Div");
	}
}
