package com.technoelevate.corejava.assignment;

public class Desktop {
	int Size;
	String resolution;
	public Desktop(int size, String resolution) {
		super();
		Size = size;
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "Desktop [Size=" + Size + ", resolution=" + resolution + "]";
	}

}
