class Foo {
	private void print() {
		System.out.println("Bonjour le monde!");
	}
	public void foo() {
		print();
	}
}

public class Bar extends Foo {
	private void print() {
		System.out.println("Hello world!");
	}
	
	public void bar() {
		print();	// It would call private one in the same class, because It can't read the parent class' function
	}
	public static void main(String args[]) {
		Bar b = new Bar();
		b.foo();
		b.bar();
	}
}
