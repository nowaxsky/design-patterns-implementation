package org.cpm.zerowastelife.strategy;

import org.cpm.zerowastelife.strategy.interfaces.FlyBehavior;
import org.cpm.zerowastelife.strategy.interfaces.QuackBehavior;

public abstract class Duck {

	//Do not use private
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
