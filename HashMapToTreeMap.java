package collection.assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapToTreeMap {
	public static void main(String[] args) {
		HashMapToTreeMap hashMapToTreeMap=new HashMapToTreeMap();
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(301, "Anil");
		map.put(304, "Jay");
		map.put(323, "Suraj");
		map.put(354, "Avinash");
		map.put(332, "Chandru");
		System.out.println(map);
		TreeMap<Integer,String> trm=new TreeMap<Integer,String>(map);
		System.out.println(trm);

	}
}
