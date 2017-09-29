package org.cpm.zerowastelife.strategy.impl;

import org.cpm.zerowastelife.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}

}
