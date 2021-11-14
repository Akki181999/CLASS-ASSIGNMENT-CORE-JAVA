package advancedjava.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetArraySort {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<Integer>();
		set.add(600);
		set.add(900);
		set.add(800);
		set.add(1000);
		set.add(700);
		ArrayList arr=new ArrayList(set);
		Collections.sort(arr);
	arr.forEach(itr->System.out.print(itr+" "));
	}
}
