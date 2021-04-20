import java.util.Locale;
import java.util.ResourceBundle;

public class testResourceBundle {
	public static void main(String args[]) {
		Locale.setDefault(Locale.FRANCE);
		//Locale currentLocale = new Locale.Builder().setLanguage("en").build();
		Locale currentLocale = new Locale("en");
		ResourceBundle rb1 = ResourceBundle.getBundle("testMsgs", Locale.getDefault());
		ResourceBundle rb2 = ResourceBundle.getBundle("testMsgs", currentLocale);
		ResourceBundle rb3 = ResourceBundle.getBundle("testMsgs", Locale.FRANCE);
		System.out.println(rb1.getString("test"));
		System.out.println(rb2.getString("test"));
		System.out.println(rb3.getString("test"));
	}
}
