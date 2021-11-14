package advancedjava.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayClassForEachMethod {
	public static void main(String[] args) {
		System.out.println("MY SCRUM TEAM");
		String [] a= {"AKSHAY","SIDDHU","RAGHU","VINSHNU"};
		List<String> list=Arrays.asList(a);
		Collections.sort(list);
		list.forEach(arr->System.out.println(arr));
}
}
