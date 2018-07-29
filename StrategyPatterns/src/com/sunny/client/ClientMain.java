package com.sunny.client;

import com.sunny.patterns.conductimpl.FlyRocketPowered;
import com.sunny.patterns.entity.AbstractDuck;
import com.sunny.patterns.entityimpl.ModelDuck;
import com.sunny.patterns.entityimpl.RedHeadDuck;
import com.sunny.patterns.entityimpl.RubberDuck;

/**
 * @program: StrategyPatterns
 * @description: 测试方法
 * @author: David
 * @create: 2018-07-29 19:01
 **/
public class ClientMain {
    public static void main(String[] args) {
        AbstractDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        AbstractDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        AbstractDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
    }
}
