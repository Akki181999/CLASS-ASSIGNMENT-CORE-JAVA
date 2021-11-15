package collection.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class CompareFriendMainMethod {
	public static void main(String[] args) {
		ArrayList<Friendship> list1=new ArrayList<Friendship>();
		list1.add(new Friendship("Raghu", 100, "BestFriend"));
		list1.add(new Friendship("Vishnu", 10, "BestFriend"));
		list1.add(new Friendship("Azesha", 1, "BestFriend"));
		list1.add(new Friendship("Avinash", 90, "BestFriend"));
		list1.add(new Friendship("Guldu", 8, "Friend"));
	 
		CompareFriend cmapare=new CompareFriend();
		Collections.sort(list1,cmapare);
		System.out.println(list1);
	}
}
