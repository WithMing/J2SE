
import java.util.Locale;


public class LocaleTest {
	public static void main(String[] args) {
		Locale defaultLocal = Locale.getDefault();
		System.out.println(defaultLocal.getCountry());
		System.out.println(defaultLocal.getLanguage());
		System.out.println(defaultLocal.getDisplayCountry());
		System.out.println(defaultLocal.getDisplayLanguage());
	}
}
