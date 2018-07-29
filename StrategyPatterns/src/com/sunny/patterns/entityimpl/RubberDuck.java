package com.sunny.patterns.entityimpl;

import com.sunny.patterns.conductimpl.FlyNoWay;
import com.sunny.patterns.conductimpl.MuteQuack;
import com.sunny.patterns.entity.AbstractDuck;

/**
 * @program: StrategyPatterns
 * @description: 橡皮鸭
 * @author: David
 * @create: 2018-07-29 21:15
 **/
public class RubberDuck extends AbstractDuck {

    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm RubberDuck");
    }
}
