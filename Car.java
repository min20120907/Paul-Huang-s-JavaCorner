abstract class Automobile {
	abstract void wheels();
}

public class Car extends Automobile {
	void wheels() {
		System.out.print(4);
	}
	public static void main(String args[]) {
		Automobile ob = new Car();
		ob.wheels();
	}
}
