package com.sunny.patterns.conductimpl;

import com.sunny.patterns.conduct.FlyBehavior;

/**
 * @program: StrategyPatterns
 * @description: 会飞行
 * @author: David
 * @create: 2018-07-29 21:03
 **/
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
