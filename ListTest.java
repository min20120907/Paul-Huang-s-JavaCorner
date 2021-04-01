import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;
public class ListTest {
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		System.out.println(list1);
		List list2 = List.copyOf(list1);
		// list2.add("C");
		System.out.println(list2);
		List<List<String>> list3 = List.of(list1, list2);
		System.out.println(list3);
	}
}
