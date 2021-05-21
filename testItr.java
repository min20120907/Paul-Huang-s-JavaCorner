import java.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
public class testItr {
	public static void main(String args[]) {
		Consumer<Object> con = a -> System.out.println(a);
		{
			Iterator iter = List.of(1,2,3).iterator();
			while(iter.hasNext()) {
				con.accept(iter.next());
			}
			
			Iterator iter2 = List.of(1,2,3).iterator();
			while(iter2.hasNext()) {
				con.accept(iter2.next());
			}
		}
		for (Iterator iter = List.of(1,2,3).iterator(); iter.hasNext();) {
			con.accept(iter.next());
		}
		for (Iterator iter2 = List.of(1,2,3).iterator();iter2.hasNext();){
			con.accept(iter2.next());
		}

	}
}
