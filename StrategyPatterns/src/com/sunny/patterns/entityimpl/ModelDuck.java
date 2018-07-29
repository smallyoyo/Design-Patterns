package com.sunny.patterns.entityimpl;

import com.sunny.patterns.conductimpl.FlyNoWay;
import com.sunny.patterns.conductimpl.Quack;
import com.sunny.patterns.entity.AbstractDuck;

/**
 * @program: StrategyPatterns
 * @description: 模型鸭
 * @author: David
 * @create: 2018-07-29 21:20
 **/
public class ModelDuck extends AbstractDuck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm ModelDuck");
    }
}
