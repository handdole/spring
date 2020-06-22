package com.mega.mvc05;

public class Factory {
	
	public Object getBean(String name) {
		if (name.equals("kcc")) {
			return new KCCWindow();
		}else if (name.equals("lg")) {
			return new LGWindow();
		}
		else {
			return null;
		}
	}
}
