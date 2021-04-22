interface Test{
	int sum(int a, int b);
}

public class TestLambda {
	public static void main(String args[]) {
		Test t = (a,int b) -> a+b;
		System.out.println(t.sum(1,2));	
	}
}

