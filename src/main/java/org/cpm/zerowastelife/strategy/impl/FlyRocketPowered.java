package org.cpm.zerowastelife.strategy.impl;

import org.cpm.zerowastelife.strategy.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
