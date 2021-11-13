package com.technoelevate.corejava.assignment;

public class Speaker {
	int volume;

	public Speaker(int volume) {
		super();
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Speaker [volume=" + volume + "]";
	}
}
