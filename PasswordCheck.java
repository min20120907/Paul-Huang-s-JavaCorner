import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class PasswordCheck {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please input the first password: ");
		String pw1 = s.nextLine();
		
		System.out.println("Please input the second password: ");
		String pw2 = s.nextLine();
		
		List<String> pws = new ArrayList<>(Arrays.asList(pw1, pw2));

		String min = pws.stream()
			.min(Comparator.comparing(String::length))
			.get();

		System.out.println(min.length());
	}
}
