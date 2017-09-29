package org.cpm.zerowastelife.strategy.impl;

import org.cpm.zerowastelife.strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
