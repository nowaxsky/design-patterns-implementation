package org.cpm.zerowastelife.strategy.impl;

import org.cpm.zerowastelife.strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
