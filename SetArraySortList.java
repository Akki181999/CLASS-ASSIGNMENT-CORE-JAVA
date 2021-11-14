package advancedjava.assignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SetArraySortList {
	public static void main(String[] args) {
		List<Integer> set =new LinkedList<Integer>();
		set.add(17);
		set.add(16);
		set.add(18);
		set.add(15);
		set.add(19);
		set.add(15);
		Collections.sort(set);
	set.forEach(itr->System.out.print(itr+" "));
}
}