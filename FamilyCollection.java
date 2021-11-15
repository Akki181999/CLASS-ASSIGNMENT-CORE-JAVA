package collection.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyCollection {
	public static void main(String[] args) {
	ArrayList<Family> ar=new ArrayList<Family>();
	ar.add(new Family( "Father", "Prasad",45));
	ar.add(new Family("Mother", "Shubhangi",40));
	Collections.sort(ar);
	System.out.println(ar);
	FamilyDec dec=new FamilyDec();
	Collections.sort(ar,dec);
	System.out.println(ar);
	}
}

