package collection.assignment;

import java.util.Comparator;

public class CompareFriend implements Comparator<Friendship>{

	@Override
	public int compare(Friendship o1, Friendship o2) {
		// TODO Auto-generated method stub
		return o2.Relation.compareTo(o1.Relation);
	}


}
