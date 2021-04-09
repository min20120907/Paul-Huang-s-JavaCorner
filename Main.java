public class Main {
	public static void greet(String... args) {
		System.out.print("Hello");
		for (String arg :args) {
			System.out.println(arg);
		}
	}
	public static void main(String args[]) {
		Main c = null;
		c.greet();
	}
}

