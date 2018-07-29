package com.sunny.patterns.entityimpl;

import com.sunny.patterns.conductimpl.FlyNoWay;
import com.sunny.patterns.conductimpl.Quack;
import com.sunny.patterns.entity.AbstractDuck;

/**
 * @program: StrategyPatterns
 * @description: 红头鸭
 * @author: David
 * @create: 2018-07-29 21:06
 **/
public class RedHeadDuck extends AbstractDuck {

    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm RedHeadDuck");
    }
}
