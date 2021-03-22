interface ExampleInterface {
	public abstract void methodB();
	// final void methodG() {	// Final is not allowed in interfaces
	// 	System.out.println("G");
	// 
	// }
	// Private modifier is not allowed in interfaces
	// 
	// private abstract void methodC();
	public String methodD();
	// 
	// The variable should be predefined
	// public int x; 
	//
	// Final is not allowed
	// 
	// final void methodE();
	// 
	// cant have body
	// 
	// public void methodF(){
	// 	System.out.println("F");
	// }
}

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
