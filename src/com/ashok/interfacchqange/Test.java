package com.ashok.interfacchqange;

public interface Test {
	
	public void add();
	
	default void multiplay() {
		System.out.println("Multplay by Hi");
	}

}
