interface Pastry {
	void getIngredients();
}

abstract class Cookie implements Pastry {}

class ChocolateCookie extends Cookie {
	public void getIngredients() {
	}
}

class CoconutChocolateCookie extends ChocolateCookie {
	void getIngredients(int x) {}
}

public class TestPastry{ 
	public static void main(String args[]) {
	}
}

