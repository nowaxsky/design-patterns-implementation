package org.cpm.zerowastelife.strategy;

import org.cpm.zerowastelife.strategy.impl.FlyRocketPowered;

public class Main {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
