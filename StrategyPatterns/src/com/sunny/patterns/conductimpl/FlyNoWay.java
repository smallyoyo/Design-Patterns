package com.sunny.patterns.conductimpl;

import com.sunny.patterns.conduct.FlyBehavior;

/**
 * @program: StrategyPatterns
 * @description: 不会飞
 * @author: David
 * @create: 2018-07-29 21:04
 **/
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
