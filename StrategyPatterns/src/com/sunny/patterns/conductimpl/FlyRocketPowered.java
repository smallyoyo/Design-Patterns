package com.sunny.patterns.conductimpl;

import com.sunny.patterns.conduct.FlyBehavior;

/**
 * @program: StrategyPatterns
 * @description: 火箭动力
 * @author: David
 * @create: 2018-07-29 21:22
 **/
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
