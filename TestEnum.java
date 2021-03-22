// Enumerator Declaration
enum QUALITY {
	A(100), B(75),C(50);
	int percent;
	private QUALITY(int percent) {
		this.percent = percent;
	}
}
// checkQuality method declaration
void checkQuality(QUALITY q) {
	switch(q) {
		case A:
			System.out.println("Best");
			break;
		default:
			System.out.println("Not best");
			break;
	}
}


public class TestEnum {
	public static void main(String args[]) {
		QUALITY q = A;
		checkQualtiy(q);
	}
}

