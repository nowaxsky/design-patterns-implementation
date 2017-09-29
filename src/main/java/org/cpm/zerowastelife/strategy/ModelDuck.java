package org.cpm.zerowastelife.strategy;

import org.cpm.zerowastelife.strategy.impl.FlyNoWay;
import org.cpm.zerowastelife.strategy.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
