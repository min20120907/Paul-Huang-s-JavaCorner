import java.util.function.Supplier;
import java.util.function.Consumer;
public class myLambda {
	public static void main(String args[]) {
		Consumer<Integer> con = (a,b) -> System.out.println(a+" hi "+b);
		con.accept(10,20);
	}
}
