import java.util.Scanner;
public class Domain {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your domain name: ");
		String str = s.nextLine();
		System.out.println("www."+str+".com");
	}
}
